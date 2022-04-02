package com.br.financeproject.validation;

import com.br.financeproject.model.bank.BankModel;

public class EmptyValidation extends BankValidation {

    public EmptyValidation(EmptyValidation emptyValidation) {
        super(emptyValidation);
    }

    public EmptyValidation() {
        super();
    }

    @Override
    protected void callEspecificValidation(BankModel bankModel) {
        System.out.println(bankModel);
    }
}
