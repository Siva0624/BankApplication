package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.Service.BankServiceImp;
import com.web.model.Bank;
import com.web.model.BankTransactions;


@Controller
public class BankController {
	
	@Autowired
	private BankServiceImp service;
	
	@RequestMapping("/")
	private String HomePage()
	{
		return "home";
	}
	@RequestMapping("NewAccount")
	private String registerpage()
	{
		return "openaccount";
	}
	@RequestMapping("NewAccount1")
	private String saveDetails(Bank bank)
	{
		service.saveBank(bank);
		return "success";
	}
	@RequestMapping("Balance")
	private String balancepage(Bank bank)
	{
		return "balanceform";
	}
	@RequestMapping("Balancecode")
	private String displayBalance(Bank bank,ModelMap model,Long accno)
	{
		model.put("b1", service.BalanceBank(accno));
		return "Form";	
	}
	@RequestMapping("Deposit")
	private String depositpage()
	{
		return "depositform";	
	}
     @RequestMapping("depositbalance")
     private String totalamount(ModelMap model,BankTransactions banktranscations,Bank bank )
     {
    	 model.put("tb",service.DepositBank(banktranscations,bank));
    	 return "deposit";
     }
     @RequestMapping("Withdraw")
     private String withdrawForm()
     {
    	 return "withdrawform";
     }
     @RequestMapping("withdrawbalance")
     private String withdrawamount(ModelMap model,BankTransactions bankTransactions,Bank bank)
     {
    	 model.put("remainingbal",service.WithdrawAmount(bankTransactions ,bank));
    	 return "withdraw";
     }
     @RequestMapping("Transfer")
     private String transferForm()
     {
    	 return "transform";
     }
     @RequestMapping("transferbalance")
     private String transferamount(ModelMap model,BankTransactions bankTransactions,Bank bank)
     {
    	 model.put("transferdamount",service.TransferBank(bankTransactions ,bank));
    	 return "aftertransfer";
     }
     @RequestMapping("CloseAccount")
     private String CloseAccountForm()
     {
    	 return "closeaccount";
     }
     @RequestMapping("closeoneaccount")
     private String closeaccount(Bank bank,Long accno)
     {
    	 service.closeBankAccount(bank, accno);
    	 return "aftercloseaccount";
     }
     
     
}

