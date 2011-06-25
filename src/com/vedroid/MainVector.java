package com.vedroid;

import com.vedroid.utils.SimpleFormat;

public class MainVector {
    static SimpleFormat sF = new SimpleFormat();
    
    public static void main(String[] args) {
        Vector a = new Vector(3, 4);
        Vector b = new Vector(0, 0);
        Vector c = new Vector(2, 3);
        
        a.decrement(c);
        b.increment(c);
        
        System.out.println("a: " + a + "  len: " + sF.format(a.getLength()));
        System.out.println("b: " + b + "  len: " + sF.format(b.getLength()));
        
        System.out.println("a+b: " + a.plus(b));
        System.out.println("b+a: " + b.plus(a));
        System.out.println("a-b: " + a.minus(b) + "\n");
        
        System.out.print("a+b==b+a: ");
        
        if ( a.plus(b). equals( b.plus(a) ) ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
