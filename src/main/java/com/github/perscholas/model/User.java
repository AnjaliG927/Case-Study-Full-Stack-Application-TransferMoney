package com.github.perscholas.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

import java.util.List;
import java.util.Objects;


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
    @Size(min = 6, max = 15)
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
   private List<TransferAccount> accountList;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="transaction_id")
    private List<TransactionDetails> transactionDetailsList;

    public User() {
    }

    public User(String username,String password, String email) {
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

    public List<TransferAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<TransferAccount> accountList) {
        this.accountList = accountList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId.equals(user.userId) &&
                username.equals(user.username) &&
                firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                password.equals(user.password) &&
                passwordConfirm.equals(user.passwordConfirm) &&
                email.equals(user.email) &&
                birthdate.equals(user.birthdate) &&
                gender.equals(user.gender) &&
                accountList.equals(user.accountList) &&
                transactionDetailsList.equals(user.transactionDetailsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, firstName, lastName, password, passwordConfirm, email, birthdate, gender, accountList, transactionDetailsList);
    }
}
