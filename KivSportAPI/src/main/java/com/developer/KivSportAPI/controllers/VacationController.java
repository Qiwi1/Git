package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.VacationEntity;
import com.developer.KivSportAPI.service.VacationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vacation")
public class VacationController {
    private final VacationService vacationService;

    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping
    public List<VacationEntity> findAllVacation(){
        return vacationService.findAllVacation();
    }

    @GetMapping("/{id}")
    public Optional<VacationEntity> findVacationById(@PathVariable("id") Long id){
        return vacationService.findById(id);
    }

    @PostMapping
    public VacationEntity saveVacation(@RequestBody VacationEntity vacation){
        return vacationService.saveVacation(vacation);
    }

    @PutMapping
    public VacationEntity updateVacation(@RequestBody VacationEntity vacation){
        return vacationService.updateVacation(vacation);
    }

    @DeleteMapping("/{id}")
    public void deleteVacation(@PathVariable("id") Long id){
        vacationService.deleteVacation(id);
    }
}
