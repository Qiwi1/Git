package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.PaymentSystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentSystemRepository extends JpaRepository<PaymentSystemEntity, Long> {
}
