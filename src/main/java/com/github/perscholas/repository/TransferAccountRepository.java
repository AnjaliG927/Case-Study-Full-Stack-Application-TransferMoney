package com.github.perscholas.repository;

import com.github.perscholas.model.TransferAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransferAccountRepository extends CrudRepository<TransferAccount, Long> {
    List<TransferAccount> findAll();
    TransferAccount findByAccountNum(String accountNum);
}
