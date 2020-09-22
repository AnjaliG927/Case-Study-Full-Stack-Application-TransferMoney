package com.github.perscholas.repository;

import com.github.perscholas.model.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {
    @Query(value="SELECT * FROM transaction_details d WHERE d.user_userid =?1",nativeQuery = true)
    List<TransactionDetails> findAllTransactionsByUserId(Long userId);
}
