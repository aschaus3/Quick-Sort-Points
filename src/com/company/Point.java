package com.company;

public class Point
{
    int x;
    int y;
    public Point(int xp, int yp)
    {
        x = xp;
        y = yp;
    }

    public Point()
    {
        x = 0;
        y = 0;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void setX(int xp)
    {
        x = xp;
    }
    public void setY(int yp)
    {
        y = yp;
    }

}
