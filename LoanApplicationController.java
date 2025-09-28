package com.example.loanapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApplicationController {

    @GetMapping("/loan-application")
    public String applyForLoan() {
        return "Loan application initiated";
    }
}
