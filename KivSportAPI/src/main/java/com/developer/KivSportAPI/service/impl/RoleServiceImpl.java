package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.RolesEntity;
import com.developer.KivSportAPI.repository.RoleRepository;
import com.developer.KivSportAPI.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RolesEntity> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<RolesEntity> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public RolesEntity findByRolename(String rolename) {
        return roleRepository.findRolesEntitiesByRolename(rolename);
    }

    @Override
    public RolesEntity saveRoles(RolesEntity roles) {
        return roleRepository.save(roles);
    }

    @Override
    public RolesEntity updateRoles(RolesEntity roles) {
        return roleRepository.save(roles);
    }

    @Override
    public void deleteRoles(Long id) {
        roleRepository.deleteById(id);
    }
}
