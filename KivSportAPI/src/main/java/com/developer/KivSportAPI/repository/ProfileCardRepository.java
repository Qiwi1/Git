package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.ProfileCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileCardRepository extends JpaRepository<ProfileCardEntity, Long> {
}
