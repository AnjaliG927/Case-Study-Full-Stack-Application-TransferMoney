package com.github.perscholas.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="recipient_details")
public class RecipientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recipientId;
    private String recipientAccNum;
    private String recipientBankNum;

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<TransactionDetails> transactionDetails;

    public RecipientDetails() {
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

    public String getRecipientBankNum() {
        return recipientBankNum;
    }

    public void setRecipientBankNum(String recipientBankNum) {
        this.recipientBankNum = recipientBankNum;
    }

    public Set<TransactionDetails> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(Set<TransactionDetails> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
