package com.github.perscholas.controllers;

import com.github.perscholas.model.TransactionDetails;
import com.github.perscholas.model.User;
import com.github.perscholas.repository.UserRepository;
import com.github.perscholas.service.TransactionDetailsService;
import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TransferController {
    private UserService userService;
    private TransactionDetailsService transactionDetailsService;

    @Autowired
    public TransferController(TransactionDetailsService transactionDetailsService, UserService userService) {
        this.transactionDetailsService = transactionDetailsService;
        this.userService = userService;
    }

    @PostMapping(value = "/sendMoney")
    public String checkoutForm() {

        return "checkoutForm";
    }

    @GetMapping(value = "/transferHistory/{username}")
    public String getTransaction(@PathVariable String username, ModelMap model) {
        User user = userService.findByUsername(username);
        List<TransactionDetails> transactionList=transactionDetailsService.findAllByUser(user.getUserId());
        System.out.println(transactionList);
        model.addAttribute("list",transactionList);
        return "transferHistory";
    }

}
