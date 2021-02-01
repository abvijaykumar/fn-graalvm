package com.abvijay.converter;


public class ConverterFunction {
    
    public String handleRequest(String input) {
        String name = (input == null || input.isEmpty()) ? "0"  : input;

        double kgValue = Double.parseDouble(name);

        double poundValue = kgValue * 2.20462;

        return "" + poundValue + " pounds";
    }

}
