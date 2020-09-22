package com.github.perscholas.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USERID")
    private Long userId;

    @Column
    @NotNull
    private String username;

    @Column(name = "FIRSTNAME")

    private String firstName;

    @Column(name = "LASTNAME")

    private String lastName;

    @NotNull
    @Size(min = 8, max = 15)
    @Pattern(regexp = "\\S+", message = "Spaces are not allowed")
    private String password;

    @JsonIgnore
    @Transient // don't persist; not a column
    private String passwordConfirm;

    @NotBlank(message = "Email is mandatory")
    @Email(regexp = ".+@.+\\..+")
    private String email;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    private Character gender;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
   private Set<TransferAccount> accountSet;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="transaction_id")
    private List<TransactionDetails> transactionDetailsList;

    public User() {
    }

    public User(Long userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public List<TransactionDetails> getTransactionDetailsList() {
        return transactionDetailsList;
    }

    public void setTransactionDetailsList(List<TransactionDetails> transactionDetailsList) {
        this.transactionDetailsList = transactionDetailsList;
    }

    public Set<TransferAccount> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(Set<TransferAccount> accountSet) {
        this.accountSet = accountSet;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
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
