package com.br.financeproject;

import com.br.financeproject.model.FinanceModel;
import com.br.financeproject.model.bank.AleloModel;
import com.br.financeproject.model.bank.NuBankModel;
import com.br.financeproject.model.bank.PagBankModel;
import com.br.financeproject.model.investment.Investiment;
import com.br.financeproject.validation.EmptyValidation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinanceProjectApplication {

	public static void main(String[] args) {


		PagBankModel pagBankModel = new PagBankModel(new EmptyValidation(), BigDecimal.valueOf(1000), BigDecimal.valueOf(5000));

		Investiment investiment = new Investiment(LocalDate.now().minusYears(1),BigDecimal.valueOf(10000));
		pagBankModel.addInvestment(investiment);

		FinanceModel finances = new FinanceModel(
				new NuBankModel(new EmptyValidation(), BigDecimal.valueOf(1000), BigDecimal.valueOf(5000), BigDecimal.valueOf(8450), BigDecimal.ZERO, BigDecimal.valueOf(8450)),
				pagBankModel,
				new AleloModel(new EmptyValidation(), BigDecimal.valueOf(1000), BigDecimal.valueOf(5000), LocalDate.now().plusMonths(1), BigDecimal.valueOf(1648))
		);
		System.out.println(finances);


	}

}
