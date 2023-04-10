package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BiletHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletHistoryRepository extends JpaRepository<BiletHistoryEntity, Long> {
}
