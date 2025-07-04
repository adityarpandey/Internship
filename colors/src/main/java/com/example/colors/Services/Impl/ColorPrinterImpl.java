package com.example.colors.Services.Impl;

import com.example.colors.Services.ColorPrinter;
import com.example.colors.Services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {

    private RedPrinter redPrinter;

    void ColorPinterImpl(RedPrinter redPrinter){
        this.redPrinter = redPrinter;
    }

    @Override
    public String print() {
        return (String.join(", " ,redPrinter.print())) ;

    }
}
