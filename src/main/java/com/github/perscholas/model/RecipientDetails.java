package com.github.perscholas.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="recipient_details")
public class RecipientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipientId;
    private String recipientname;
    private String recipientAccNum;
    private String recipientBankName;


    public RecipientDetails() {
    }

    public String getRecipientname() {
        return recipientname;
    }

    public void setRecipientname(String recipientname) {
        this.recipientname = recipientname;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientAccNum() {
        return recipientAccNum;
    }

    public void setRecipientAccNum(String recipientAccNum) {
        this.recipientAccNum = recipientAccNum;
    }

    public String getRecipientBankName() {
        return recipientBankName;
    }

    public void setRecipientBankName(String recipientBankName) {
        this.recipientBankName = recipientBankName;
    }
    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
