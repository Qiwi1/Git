package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.LocationWarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationWarehouseRepository extends JpaRepository<LocationWarehouseEntity, Long> {
}
