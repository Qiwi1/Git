package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Long> {
}
