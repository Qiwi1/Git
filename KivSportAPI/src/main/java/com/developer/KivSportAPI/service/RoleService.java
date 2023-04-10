package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.ProfileEntity;
import com.developer.KivSportAPI.models.ProviderEntity;
import com.developer.KivSportAPI.models.RolesEntity;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<RolesEntity> findAllRoles();
    Optional<RolesEntity> findById(Long id);
    RolesEntity findByRolename(String rolename);
    RolesEntity saveRoles(RolesEntity roles);
    RolesEntity updateRoles(RolesEntity roles);
    void deleteRoles(Long id);
}
