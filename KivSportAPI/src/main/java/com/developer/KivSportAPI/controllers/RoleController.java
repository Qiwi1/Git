package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.RolesEntity;
import com.developer.KivSportAPI.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RolesEntity> findAllRoles(){
        return roleService.findAllRoles();
    }

    @GetMapping("/{id}")
    public Optional<RolesEntity> findRolesById(@PathVariable("id") Long id){
        return roleService.findById(id);
    }

    @GetMapping("/name/{rolename}")
    public RolesEntity findRoleByName(@PathVariable("rolename") String rolename){
        return roleService.findByRolename(rolename);
    }

    @PostMapping
    public RolesEntity saveRoles(@RequestBody RolesEntity roles){
        return roleService.saveRoles(roles);
    }

    @PutMapping
    public RolesEntity updateRoles(@RequestBody RolesEntity roles){
        return roleService.updateRoles(roles);
    }

    @DeleteMapping("/{id}")
    public void deleteRoles(@PathVariable("id") Long id){
        roleService.deleteRoles(id);
    }
}
