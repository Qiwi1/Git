package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BiletTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletTypeRepository extends JpaRepository<BiletTypeEntity, Long> {
}
