package com.company;
import java.util.Comparator;
import java.util.LinkedList;
public class QuickSort
{
    public static class DefaultComparator<K> implements Comparator<K>
    {
        public int compare(K a, K b) throws ClassCastException
        {
            return ((Comparable<K>)a).compareTo(b);
        }
    }

    public static <K> void quickSort(LinkedList<K> s, Comparator<K> comp)
    {
        if(comp == null)
            comp =  new DefaultComparator<>();

        int n = s.size();   //Getting the size
        if(n < 2) return;   //Base case

        K pivot = s.getFirst();
        LinkedList<K> L = new LinkedList<>();
        LinkedList<K> E = new LinkedList<>();
        LinkedList<K> G = new LinkedList<>();

        while(!s.isEmpty())
        {
            K element = s.remove();
            int c = comp.compare(element,pivot);
            if(c < 0)
                L.add(element);
            else if(c == 0)
                E.add(element);
            else
                G.add(element);
        }

        quickSort(L,comp);
        quickSort(G,comp);

        while(!L.isEmpty())
            s.add(L.remove());
        while(!E.isEmpty())
            s.add(E.remove());
        while(!G.isEmpty())
            s.add(G.remove());
    }
}
