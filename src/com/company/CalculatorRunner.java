package com.company;

import java.math.BigDecimal;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator cal = new Calculator("4500.00","7.5");
        BigDecimal total = cal.calculateTotalValue(5);
        System.out.println(total);

    }
}
