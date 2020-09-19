package com.github.perscholas.service;

import com.github.perscholas.model.RecipientDetails;
import com.github.perscholas.repository.RecipientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientDetailsService {
    private RecipientDetailsRepository recipientDetailsRepository;

@Autowired
    public RecipientDetailsService(RecipientDetailsRepository recipientDetailsRepository) {
        this.recipientDetailsRepository = recipientDetailsRepository;
    }
}
