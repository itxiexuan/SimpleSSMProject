package com.itxxx.servlet;

import com.itxxx.domain.Account;
import com.itxxx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountServlet {
    @Autowired
    private AccountService as;
    @RequestMapping("/findById.do")
    public String findById(Model model){
        Account account = as.findById(4);
        model.addAttribute("item",account);
        return "itemDetail";
    }
    @RequestMapping("/saveAccount.do")
    public String saveAccount(){
        Account account = new Account();
        account.setMoney(888.0);
        account.setName("是经典");
        as.saveAccount(account);
        return "success";
    }
    @RequestMapping("/deleteAccountById.do")
    public String deleteAccount(){
        as.deleteAccountById(4);
        return "success";
    }
    @RequestMapping("/updateAccount.do")
    public String updateAccount(){
        Account account = new Account();
        account.setMoney(888.0);
        account.setName("是经典");
        account.setId(5);
        as.saveAccount(account);
        return "success";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> all = as.findAll();
        model.addAttribute("all",all);
        return "one";
    }
}
