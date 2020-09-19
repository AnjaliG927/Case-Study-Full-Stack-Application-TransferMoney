package com.github.perscholas.service;

import com.github.perscholas.model.TransactionDetails;
import com.github.perscholas.repository.TransactionDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionDetailsService {
    private TransactionDetailsRepository transactionDetailsRepository ;
   @Autowired
    public TransactionDetailsService(TransactionDetailsRepository transactionDetailsRepository) {
        this.transactionDetailsRepository = transactionDetailsRepository;
    }
}
