package com.br.financeproject.model.investment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Investiment {
    private final LocalDate startDate;
    private BigDecimal currentAmount;

    public Investiment(LocalDate startDate, BigDecimal currentAmount) {
        this.startDate = startDate;
        this.currentAmount = currentAmount;
    }

    public void addAmount(BigDecimal addingValue) {
        this.currentAmount = this.currentAmount.add(addingValue);
    }

    public void withdrawAmount(BigDecimal withdraw){
        this.currentAmount = currentAmount.subtract(withdraw);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    @Override
    public String toString() {
        return "Investiment{" +
                "startDate=" + startDate +
                ", currentAmount=" + currentAmount +
                '}';
    }
}
