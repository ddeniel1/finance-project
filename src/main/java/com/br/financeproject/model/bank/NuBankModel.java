package com.br.financeproject.model.bank;

import com.br.financeproject.validation.BankValidation;

import java.math.BigDecimal;

public class NuBankModel extends BankModel{
    private BigDecimal remainingCredit;
    private BigDecimal usedCredit;
    private BigDecimal totalCredit;


    public NuBankModel(BankValidation validationList, BigDecimal savings, BigDecimal current, BigDecimal remainingCredit, BigDecimal usedCredit, BigDecimal totalCredit) {
        super(validationList, savings, current);
        this.remainingCredit = remainingCredit;
        this.usedCredit = usedCredit;
        this.totalCredit = totalCredit;
    }

    public BigDecimal getRemainingCredit() {
        return remainingCredit;
    }

    public BigDecimal getUsedCredit() {
        return usedCredit;
    }

    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    @Override
    public String toString() {
        return "NuBankModel{" + super.toString() +
                ", remainingCredit=" + remainingCredit +
                ", usedCredit=" + usedCredit +
                ", totalCredit=" + totalCredit +
                '}';
    }
}
