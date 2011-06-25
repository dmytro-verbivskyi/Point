package com.vedroid;

import com.vedroid.utils.SimpleFormat;

public class Point {
    public double x, y;
    private SimpleFormat sF = new SimpleFormat();
    
    public Point(double newX, double newY) {
        x = newX;
        y = newY;
    }
    
    public String toString() {
        return "(" + sF.format(x) + ";" + sF.format(y) + ")";
    }
    
    public double getDistance(Point other) {
        double distance = Math.sqrt(Math.pow(x - other.x, 2) +
                                    Math.pow(y - other.y, 2));
        return distance;
    }
}
