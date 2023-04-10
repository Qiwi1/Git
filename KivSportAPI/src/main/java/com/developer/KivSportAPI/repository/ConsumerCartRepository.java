package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.ConsumerCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerCartRepository extends JpaRepository<ConsumerCartEntity, Long> {
}
