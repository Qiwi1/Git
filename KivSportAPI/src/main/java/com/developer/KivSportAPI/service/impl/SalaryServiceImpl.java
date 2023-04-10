package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.SalaryEntity;
import com.developer.KivSportAPI.repository.SalaryRepository;
import com.developer.KivSportAPI.service.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryServiceImpl implements SalaryService {

    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @Override
    public List<SalaryEntity> findAllSalary() {
        return salaryRepository.findAll();
    }

    @Override
    public Optional<SalaryEntity> findById(Long id) {
        return salaryRepository.findById(id);
    }

    @Override
    public SalaryEntity saveSalary(SalaryEntity salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public SalaryEntity updateSalary(SalaryEntity salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public void deleteSalary(Long id) {
        salaryRepository.deleteById(id);
    }
}
