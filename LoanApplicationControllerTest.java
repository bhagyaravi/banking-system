package com.example.loanapplication.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(LoanApplicationController.class)
public class LoanApplicationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testApplyForLoan() throws Exception {
        mockMvc.perform(get("/loan-application"))
                .andExpect(status().isOk())
                .andExpect(content().string("Loan application initiated"));
    }
}
