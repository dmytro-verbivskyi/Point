package com.vedroid;

public class Vector {
    public Point point1, point0;
    
    public Vector(double xDistance, double yDistance) {
        point1 = new Point(xDistance, yDistance);
        point0 = new Point(0, 0);
    }
    
    public String toString() {
        return point1.toString();
    }
    
    public void increment(Vector other) {
        point1.x += other.point1.x;
        point1.y += other.point1.y;
    }
    
    public void decrement(Vector other) {
        point1.x -= other.point1.x;
        point1.y -= other.point1.y;
    }
    
    public double getLength() {
        return point1.getDistance(point0);
    }
    
    public Vector plus(Vector other) {
        double newX = point1.x + other.point1.x;
        double newY = point1.y + other.point1.y;
        
        return new Vector(newX, newY);
    }
    
    public Vector minus(Vector other) {
        double newX = point1.x - other.point1.x;
        double newY = point1.y - other.point1.y;
        
        return new Vector(newX, newY);
    }
    
    public boolean equals(Vector other) {
        if ( point1.x == other.point1.x ) {
            if ( point1.y == other.point1.y ) {
                return true;
            }
        }
        return false;
    }
}
