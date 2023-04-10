package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity, Long> {
    RolesEntity findRolesEntitiesByRolename(String rolename);
}
