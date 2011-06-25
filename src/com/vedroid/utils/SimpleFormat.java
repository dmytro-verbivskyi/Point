package com.vedroid.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SimpleFormat {
    private static DecimalFormat simpleFormat;
    
    public SimpleFormat() {
        setupFormat();
    }
    
    private static void setupFormat() {
        DecimalFormatSymbols formatSymbol = new DecimalFormatSymbols();;
        
        formatSymbol.setDecimalSeparator('.');
        simpleFormat = new DecimalFormat("#.####", formatSymbol);
    }

    public String format(double x) {
        return simpleFormat.format(x);
    }
}
