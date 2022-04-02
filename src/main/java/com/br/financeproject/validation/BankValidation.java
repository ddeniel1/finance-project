package com.br.financeproject.validation;

import com.br.financeproject.model.bank.BankModel;

public abstract class BankValidation {

    protected BankValidation nextValidation;

    public void validate(BankModel bankModel) {
        callEspecificValidation(bankModel);

        proceedValidation(bankModel);
    }

    public BankValidation(BankValidation nextValidation) {
        this.nextValidation = nextValidation;
    }

    public BankValidation() {
    }

    public void addValidation(BankValidation bankValidation) {
        BankValidation actual = this;

        while (actual.getNextValidation() != null) {
            actual = actual.getNextValidation();
        }
        bankValidation.setNextValidation(bankValidation);
    }

    private void proceedValidation(BankModel bankModel) {
        if (nextValidation == null) return;
        nextValidation.validate(bankModel);
    }

    protected abstract void callEspecificValidation(BankModel bankModel);

    public BankValidation getNextValidation() {
        return nextValidation;
    }

    public void setNextValidation(BankValidation nextValidation) {
        if (this.nextValidation != null) throw new RuntimeException("Validação ja existe");
        this.nextValidation = nextValidation;
    }
}
