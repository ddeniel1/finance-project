package com.br.financeproject.model.bank;

import com.br.financeproject.model.investment.Investiment;
import com.br.financeproject.validation.BankValidation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PagBankModel extends BankModel{

    private final List<Investiment> investiments = new ArrayList<>();

    public PagBankModel(BankValidation validationList, BigDecimal savings, BigDecimal current) {
        super(validationList, savings, current);
    }

    public void addInvestment(Investiment investiment){
        investiments.add(investiment);
    }

    public List<Investiment> getInvestiments() {
        return investiments;
    }

    @Override
    public String toString() {
        return "PagBankModel{" + super.toString() +
                ", investiments=" + investiments +
                '}';
    }
}
