package com.github.perscholas.model;

import javax.persistence.*;

@Entity
@Table(name="transfer_account")
public class TransferAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String bankName;
    private String preference;
@ManyToOne()
@JoinColumn(name="userId", nullable=false, updatable=false)
    private User user;

    public TransferAccount() {
    }

    public TransferAccount(String bankName, String preference, User user) {
        this.bankName = bankName;
        this.preference = preference;
        this.user = user;

    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
