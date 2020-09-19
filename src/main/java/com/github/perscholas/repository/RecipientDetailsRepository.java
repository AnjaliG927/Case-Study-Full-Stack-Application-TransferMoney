package com.github.perscholas.repository;

import com.github.perscholas.model.RecipientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientDetailsRepository extends JpaRepository<RecipientDetails,Long> {
}
