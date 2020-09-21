package com.github.perscholas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransferController {
    @PostMapping(value="/sendMoney")
    public String checkoutForm(){

        return "checkoutForm";
    }


}
