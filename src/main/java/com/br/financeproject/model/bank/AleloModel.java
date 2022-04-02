package com.br.financeproject.model.bank;

import com.br.financeproject.validation.BankValidation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AleloModel extends BankModel{


    private LocalDate nextDeposit;
    private BigDecimal nextDepositAmount;


    public AleloModel(BankValidation validationList, BigDecimal savings, BigDecimal current, LocalDate nextDeposit, BigDecimal nextDepositAmount) {
        super(validationList, savings, current);
        this.nextDeposit = nextDeposit;
        this.nextDepositAmount = nextDepositAmount;
    }


    public BigDecimal getNextDepositAmount() {
        return nextDepositAmount;
    }

    public LocalDate getNextDeposit() {
        return nextDeposit;
    }

    @Override
    public String toString() {
        return "AleloModel{" + super.toString() +
                ", nextDeposit=" + nextDeposit +
                ", nextDepositAmount=" + nextDepositAmount +
                '}';
    }
}
