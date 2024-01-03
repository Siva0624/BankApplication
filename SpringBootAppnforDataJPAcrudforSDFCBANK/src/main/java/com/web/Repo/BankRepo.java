package com.web.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Long> {

}

