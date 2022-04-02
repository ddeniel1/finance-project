package com.br.financeproject.model;

import com.br.financeproject.model.bank.AleloModel;
import com.br.financeproject.model.bank.NuBankModel;
import com.br.financeproject.model.bank.PagBankModel;

public class FinanceModel {
    private final NuBankModel nuBank;
    private final PagBankModel pagBank;
    private final AleloModel alelo;

    public FinanceModel(NuBankModel nuBank, PagBankModel pagBank, AleloModel alelo) {
        this.nuBank = nuBank;
        this.pagBank = pagBank;
        this.alelo = alelo;
    }

    public NuBankModel getNuBank() {
        return nuBank;
    }

    public PagBankModel getPagBank() {
        return pagBank;
    }

    public AleloModel getAlelo() {
        return alelo;
    }

    @Override
    public String toString() {
        return "FinanceModel{" +
                "\n\tnuBank=" + nuBank +
                ",\n\t pagBank=" + pagBank +
                ",\n\t alelo=" + alelo +
                '}';
    }
}
