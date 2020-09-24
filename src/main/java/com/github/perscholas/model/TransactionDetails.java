package com.github.perscholas.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="transaction_details")
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="transaction_id")
    private Long transaction_id;
    @Column(name="exchangerate")
    private String exchangeRate ;
    @Column(name="fromcountry")
    private String fromCountry;
    @Column(name="tocountry")
    private String toCountry;
    @Column(name="status")
    private String status;
    @Column(name="amount")
    private Double amount;
    @Column(name="transactiondate")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;

    @ManyToOne()
    private RecipientDetails recipientdetails;

    @ManyToOne(cascade=CascadeType.MERGE)
    private User user;

    public TransactionDetails() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RecipientDetails getRecipientDetails() {
        return recipientdetails;
    }

    public void setRecipientDetails(RecipientDetails recipientDetails) {
        this.recipientdetails = recipientDetails;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getTransactionId() {
        return transaction_id;
    }

    public void setTransactionId(Long transactionId) {
        this.transaction_id = transaction_id;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
