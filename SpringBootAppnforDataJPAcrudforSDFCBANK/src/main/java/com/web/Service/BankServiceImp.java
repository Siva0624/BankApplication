package com.web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repo.BankRepo;
import com.web.model.Bank;
import com.web.model.BankTransactions;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class BankServiceImp implements BankService {
  
	@Autowired
	private BankRepo repo;
	
	@Override
	public Bank saveBank(Bank bank) {
		
		return repo.save(bank);
	}


	@Override
	public Bank BalanceBank(Long accno) {
		Bank b=repo.findById(accno).get();
		return b;
	}
	
	@Override
	public Bank TransferBank(BankTransactions bankTransactions,Bank bank) {
		java.util.Optional<Bank> dbaccount1=repo.findById(bank.getAccno());
		Bank a1=dbaccount1.get();
		a1.setAmount(a1.getAmount()-bankTransactions.getTransferamount());
		repo.save(a1);
		
		java.util.Optional<Bank> dbaccount2=repo.findById(bankTransactions.getAccno2());
		Bank a2=dbaccount2.get();
		a2.setAmount(a2.getAmount()+bankTransactions.getTransferamount());
		return repo.save(a2);
		
	}

	@Override
	public Bank DepositBank(BankTransactions banktranscations, Bank bank) {
		java.util.Optional<Bank> allaccounts=repo.findById(bank.getAccno());
		Bank dbaccountdetails=allaccounts.get();
		double currentbalance=dbaccountdetails.getAmount();
		double depositamount=banktranscations.getDepositamount();
		double totalbalance=currentbalance+depositamount;
		dbaccountdetails.setAmount(totalbalance);
		return repo.save(dbaccountdetails);
		}
	
	@Override
	public Bank WithdrawAmount(BankTransactions bankTransactions,Bank bank) {
		java.util.Optional<Bank> allaccounts=repo.findById(bank.getAccno());
		Bank dbaccountdetails=allaccounts.get();
		dbaccountdetails.setAmount(dbaccountdetails.getAmount()-bankTransactions.getWithdrawamount());
		return repo.save(dbaccountdetails);
	}

	
	public Bank closeBankAccount(Bank bank, Long accno) {
		java.util.Optional<Bank>alldetails=repo.findById(bank.getAccno());
	    Bank onerecord=alldetails.get();
	    int presentstatus=onerecord.getStatus();
	    if(presentstatus==1)
	    {
	    	onerecord.setStatus(0);
	    }
	    else
	    {
	    	onerecord.setStatus(0);
	    }
	    return repo.save(onerecord);
		
	}

}