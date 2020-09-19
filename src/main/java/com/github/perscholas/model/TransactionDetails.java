package com.github.perscholas.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="transaction_details")
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long transactionId;
    private String exchangeRate ;
    private String fromCountry;
    private String toCountry;
    private String status;
    private Date transactionDate;
    @ManyToMany(cascade=CascadeType.ALL)
    private Set<RecipientDetails> recipientDetails;

    @ManyToOne(cascade=CascadeType.ALL)
    private User user;

    public TransactionDetails() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<RecipientDetails> getRecipientDetails() {
        return recipientDetails;
    }

    public void setRecipientDetails(Set<RecipientDetails> recipientDetails) {
        this.recipientDetails = recipientDetails;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
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
}
