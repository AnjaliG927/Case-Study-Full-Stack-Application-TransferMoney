package com.github.perscholas.service;

import com.github.perscholas.model.RecipientDetails;
import com.github.perscholas.model.User;
import com.github.perscholas.repository.RecipientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class RecipientDetailsService {
    private RecipientDetailsRepository recipientDetailsRepository;

@Autowired
    public RecipientDetailsService(RecipientDetailsRepository recipientDetailsRepository) {
        this.recipientDetailsRepository = recipientDetailsRepository;
    }

    @CacheEvict(allEntries = true)
    public void create(RecipientDetails recipientDetails) {
        recipientDetailsRepository.save(recipientDetails);
    }
}
