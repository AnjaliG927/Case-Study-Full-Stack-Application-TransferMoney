//package com.github.perscholas.config;
//
//import com.github.perscholas.model.RecipientDetails;
//import com.github.perscholas.model.TransactionDetails;
//import com.github.perscholas.model.User;
//import com.github.perscholas.repository.RecipientDetailsRepository;
//import com.github.perscholas.repository.TransactionDetailsRepository;
//import com.github.perscholas.repository.UserRepository;
//import com.github.perscholas.service.RecipientDetailsService;
//import com.github.perscholas.service.TransactionDetailsService;
//import com.github.perscholas.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by leon on 9/24/2020.
// * Modified by Anjali on 9/24/2020.
// */
//@Configuration
//public class UserConfig {
//    @Autowired
//    private UserRepository userRepository;
//    private UserService userService;
//    private TransactionDetailsRepository transactionDetailsRepository;
//    private RecipientDetailsRepository recipientDetailsRepository;
//
//    @PostConstruct
//    public void setup() throws ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        List<User> userList = new ArrayList<>();
//        User user = new User();
//        user.setFirstName("Anjali");
//        user.setLastName("G");
//        user.setUsername("AnjaliG");
//        user.setPassword("abcdefg");
//        user.setBirthdate(dateFormat.parse("2014-11-6"));
//        user.setEmail("abc@cde.com");
//        user.setGender('F');
//        userList.add(user);
//
//        User user1 = new User();
//        user1.setFirstName("Sammy");
//        user1.setLastName("K");
//        user1.setUsername("Sammyk");
//        user1.setPassword("qwertyu");
//        user1.setBirthdate(dateFormat.parse("1978-2-8"));
//        user1.setEmail("def@456.com");
//        user1.setGender('M');
//        userList.add(user1);
//
//        User user2 = new User();
//        user2.setFirstName("Garry");
//        user2.setLastName("H");
//        user2.setUsername("GarryH");
//        user2.setPassword("iop34as");
//        user2.setBirthdate(dateFormat.parse("1983-1-10"));
//        user2.setEmail("def@456.com");
//        user2.setGender('M');
//        userList.add(user2);
//
//        User user3 = new User();
//        user3.setFirstName("Carrol");
//        user3.setLastName("M");
//        user3.setUsername("CarolM");
//        user3.setPassword("deftgy45");
//        user3.setBirthdate(dateFormat.parse("1993-2-7"));
//        user3.setEmail("carolM@yahoo.com");
//        user3.setGender('F');
//        userList.add(user3);
//
//        User user4 = new User();
//        user4.setFirstName("Micheal");
//        user4.setLastName("T");
//        user4.setUsername("Mickey");
//        user4.setPassword("mickey654");
//        user4.setBirthdate(dateFormat.parse("2013-12-8"));
//        user4.setEmail("mickey@wertty.com");
//        user4.setGender('M');
//        userList.add(user4);
//        userList.forEach(userSave -> userRepository.save(userSave));
//
////=======================================================================================================================
////        List<RecipientDetails> recList = new ArrayList<>();
////        RecipientDetails recipientDetails=new RecipientDetails();
////        recipientDetails.setRecipientAccNum("123456");
////        recipientDetails.setRecipientBankName("xyz");
////        recipientDetails.setRecipientname("Maggi");
////        recList.add(recipientDetails);
////
////        RecipientDetails recipientDetails1=new RecipientDetails();
////        recipientDetails1.setRecipientAccNum("789012");
////        recipientDetails1.setRecipientBankName("abc");
////        recipientDetails1.setRecipientname("Mahim");
////        recList.add(recipientDetails1);
////
////        RecipientDetails recipientDetails2=new RecipientDetails();
////        recipientDetails2.setRecipientAccNum("234567");
////        recipientDetails2.setRecipientBankName("def");
////        recipientDetails2.setRecipientname("Gary");
////        recList.add(recipientDetails2);
////
////        RecipientDetails recipientDetails3=new RecipientDetails();
////        recipientDetails3.setRecipientAccNum("891023");
////        recipientDetails3.setRecipientBankName("ghk");
////        recipientDetails3.setRecipientname("Tania");
////        recList.add(recipientDetails3);
////
////
////
//////=======================================================================================================================
////
////        List<TransactionDetails> transactionList = new ArrayList<>();
////
////        TransactionDetails transactionDetails= new TransactionDetails();
////        transactionDetails.setAmount(1000.00);
////        transactionDetails.setFromCountry("USA");
////        transactionDetails.setRecipientDetails(recipientDetails1);
////        transactionDetails.setStatus("Delivered");
////        transactionDetails.setTransactionDate(dateFormat.parse("2015-12-17"));
////        transactionDetails.setUser(user1);
////        transactionList.add(transactionDetails);
////
////
////        TransactionDetails transactionDetails1= new TransactionDetails();
////        transactionDetails1.setAmount(2000.00);
////        transactionDetails1.setFromCountry("USA");
////        transactionDetails1.setRecipientDetails(recipientDetails2);
////        transactionDetails1.setStatus("Delivered");
////        transactionDetails1.setTransactionDate(dateFormat.parse("2016-02-17"));
////        transactionDetails1.setUser(user1);
////        transactionList.add(transactionDetails1);
////
////        TransactionDetails transactionDetails2= new TransactionDetails();
////        transactionDetails2.setAmount(3000.00);
////        transactionDetails2.setFromCountry("USA");
////        transactionDetails2.setRecipientDetails(recipientDetails1);
////        transactionDetails2.setStatus("Pending");
////        transactionDetails2.setTransactionDate(dateFormat.parse("2019-12-17"));
////        transactionDetails2.setUser(user2);
////        transactionList.add(transactionDetails2);
////
////        TransactionDetails transactionDetails3= new TransactionDetails();
////        transactionDetails3.setAmount(1000.00);
////        transactionDetails3.setFromCountry("USA");
////        transactionDetails3.setRecipientDetails(recipientDetails3);
////        transactionDetails3.setStatus("Delivered");
////        transactionDetails3.setTransactionDate(dateFormat.parse("2015-12-17"));
////        transactionDetails3.setUser(user2);
////        transactionList.add(transactionDetails3);
////
////        recList.forEach(recipients->recipientDetailsRepository.save(recipients));
////        transactionList.forEach(transactions->transactionDetailsRepository.save(transactions));
//
//    }
//
//    private void purgeUsers() {
//        userService
//                .findAllUsers()
//                .stream()
//                .forEach(user -> userService.deleteById(user.getUserId()));
//    }
//}
