package com.github.perscholas.service;

import com.github.perscholas.repository.TransferAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferAccountService {
    private TransferAccountRepository transferAccountRepository;
@Autowired
    public TransferAccountService(TransferAccountRepository transferAccountRepository) {
        this.transferAccountRepository = transferAccountRepository;
    }
}
