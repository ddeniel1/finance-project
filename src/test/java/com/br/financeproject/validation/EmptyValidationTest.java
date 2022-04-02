package com.br.financeproject.validation;

import com.br.financeproject.model.bank.BankModel;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmptyValidationTest {

    @Test
    void callValidationChain() {

        EmptyValidation bankValidation = Mockito.mock(EmptyValidation.class);
        BankModel bankModel = new BankModel(bankValidation, BigDecimal.ZERO, BigDecimal.ZERO);
        bankModel.setCurrent(BigDecimal.TEN);
        Mockito.verify(bankValidation, Mockito.times(1)).validate(bankModel);


    }
}