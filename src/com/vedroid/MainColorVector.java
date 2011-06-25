package com.vedroid;

import com.vedroid.utils.SimpleFormat;

public class MainColorVector {
    static SimpleFormat sF = new SimpleFormat();
    
    public static void main(String[] args) {
        ColorVector a = new ColorVector("red", 3, 4);
        ColorVector b = new ColorVector("green", 0, 0);
        ColorVector c = new ColorVector("orange", 2, 3);
        ColorVector d = new ColorVector("red", 5, 5);
        
        a.decrement(c);
        b.increment(c);
        
        System.out.println("a: " + a + "  len: " + sF.format(a.getLength()));
        System.out.println("b: " + b + "  len: " + sF.format(b.getLength()));
        System.out.println("a+b:  " + a.plus(b));
        System.out.println("b+a:  " + b.plus(a));
        System.out.println("a-b:  " + a.minus(b));
        System.out.println("d+d:  " + d.plus(d) + "\n");
        
        System.out.print("a+b==b+a: ");
        if ( a.plus(b). equals( b.plus(a) ) ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
