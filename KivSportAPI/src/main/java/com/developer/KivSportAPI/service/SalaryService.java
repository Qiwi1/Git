package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.RolesEntity;
import com.developer.KivSportAPI.models.SalaryEntity;

import java.util.List;
import java.util.Optional;

public interface SalaryService {
    List<SalaryEntity> findAllSalary();
    Optional<SalaryEntity> findById(Long id);
    SalaryEntity saveSalary(SalaryEntity salary);
    SalaryEntity updateSalary(SalaryEntity salary);
    void deleteSalary(Long id);
}
