package com.vedroid;

public class ColorVector extends Vector {
    private String color;
    
    public ColorVector(String colorValue, double xDistance, double yDistance) {
        super(xDistance, yDistance);
        color = new String(colorValue);
    }
    
    public String toString() {
        return color + " " + super.toString();
    }
    
    public ColorVector plus(ColorVector other) {
        String newColor = new String(color + "-" + other.color);
        double newX = point1.x + other.point1.x;
        double newY = point1.y + other.point1.y;
        
        return new ColorVector(newColor, newX, newY);
    }
    
    public boolean equals(ColorVector other) {
        if ( super.equals(other) && color.equals(other.color) ) {
            return true;
        }
        return false;
    }
    
    public ColorVector minus(ColorVector other) {
        String newColor = new String(color + "-" + other.color);
        double newX = point1.x - other.point1.x;
        double newY = point1.y - other.point1.y;
        
        return new ColorVector(newColor, newX, newY);
    }
    
    public void increment(ColorVector other) {
        color = new String(color + "-" + other.color);
        super.increment(other);
    }
    
    public void decrement(ColorVector other) {
        color = new String(color + "-" + other.color);
        super.decrement(other);
    }
    
    public double getLength() {
        return super.getLength();
    }
    
}
