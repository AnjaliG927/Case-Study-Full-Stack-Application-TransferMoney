package com.github.perscholas.service;

import com.github.perscholas.model.TransactionDetails;
import com.github.perscholas.repository.TransactionDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDetailsService {
    private TransactionDetailsRepository transactionDetailsRepository;

    @Autowired
    public TransactionDetailsService(TransactionDetailsRepository transactionDetailsRepository) {
        this.transactionDetailsRepository = transactionDetailsRepository;
    }

    public List<TransactionDetails> getAll() {
        Iterable<TransactionDetails> transactionDetailsIterable = transactionDetailsRepository.findAll();
        List<TransactionDetails> transactionDetails = new ArrayList<>();
        transactionDetailsIterable.forEach(transactionDetails::add);
        return transactionDetails;
    }

    public TransactionDetails findById(Long id) {
        return transactionDetailsRepository.findById(id).get();
    }

    public List<TransactionDetails> findAllByUser(Long id) {
        Iterable<TransactionDetails> transactionDetailsIterable = transactionDetailsRepository.findAllTransactionsByUserId(id);
        List<TransactionDetails> transactionDetails = new ArrayList<>();
        transactionDetailsIterable.forEach(transactionDetails::add);
        return transactionDetails;

    }


}
