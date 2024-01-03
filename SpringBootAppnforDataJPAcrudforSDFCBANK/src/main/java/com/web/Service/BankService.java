package com.web.Service;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Bank;
import com.web.model.BankTransactions;

public interface BankService {
		
	    public Bank saveBank(Bank bank);
	    public Bank BalanceBank(Long accno);
	    public Bank DepositBank(BankTransactions banktranscations, Bank bank);
	    public Bank closeBankAccount(Bank bank, Long accno);
	    public Bank WithdrawAmount(BankTransactions bankTransactions,Bank bank);
	    public Bank TransferBank(BankTransactions bankTransactions,Bank bank);
}
