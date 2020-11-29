package com.company;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<Point> points = new LinkedList<>();
        points.add(new Point(5,6));
        points.add(new Point(7,10));
        points.add(new Point(50,4));
        points.add(new Point(7,3));

        System.out.println("Original List: " + (points));

        QuickSort.quickSort(points, new Comparator<Point>() {
            public int compare(Point a, Point b)
            {
                if(a.getX() != b.getX())
                    return Integer.compare(a.getX(), b.getX());
                else
                    return Integer.compare(a.getY(), b.getY());
            }
        });

        System.out.println("New List: " + points);
    }


}
