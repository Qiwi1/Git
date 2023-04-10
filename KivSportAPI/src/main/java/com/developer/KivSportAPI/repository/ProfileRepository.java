package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
    ProfileEntity findByProfilelogin(String profilelogin);
}
