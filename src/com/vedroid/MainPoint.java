package com.vedroid;

import com.vedroid.utils.SimpleFormat;

public class MainPoint {
    static SimpleFormat sF = new SimpleFormat();
    
    public static void main(String[] args) {
        Point start = new Point(0, 0);
        Point end = new Point(3, 4);
        
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        
        System.out.println("Distance: " +  sF.format(start.getDistance(end)));
        
        start.x = 3;
        System.out.println("Distance: " +  sF.format(start.getDistance(end)));
    }
}
