package com.company;

import java.math.BigDecimal;

public class Calculator {
    BigDecimal principal;
    BigDecimal interest;

    public Calculator(String principal, String interest){
        this.principal= new BigDecimal(principal);
        this.interest= new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int numberOfYears){
        BigDecimal totalValue = principal.add(principal.multiply(interest.multiply(new BigDecimal(numberOfYears))));
        return totalValue;
    }

}
