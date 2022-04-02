package com.br.financeproject.model.bank;

import com.br.financeproject.validation.BankValidation;

import java.math.BigDecimal;

public class BankModel {

    private final BankValidation validation;

    private BigDecimal savings;
    private BigDecimal current;


    public BankModel(BankValidation validation, BigDecimal savings, BigDecimal current) {
        this.validation = validation;
        this.savings = savings;
        this.current = current;
    }

    public void setSavings(BigDecimal savings) {
        validation.validate(this);
        this.savings = savings;
    }

    public void setCurrent(BigDecimal current) {
        validation.validate(this);
        this.current = current;
    }


    public BigDecimal getSavings() {
        return savings;
    }

    public BigDecimal getCurrent() {
        return current;
    }


    public BankValidation getValidation() {
        return validation;
    }

    @Override
    public String toString() {
        return  "savings=" + savings +
                ", current=" + current;
    }
}
