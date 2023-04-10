package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.VacationTypeEntity;
import com.developer.KivSportAPI.service.VacationTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vacationtype")
public class VacationTypeController {
    private final VacationTypeService vacationTypeService;

    public VacationTypeController(VacationTypeService vacationTypeService) {
        this.vacationTypeService = vacationTypeService;
    }

    @GetMapping
    public List<VacationTypeEntity> findAllVacationType(){
        return vacationTypeService.findAllVacationType();
    }

    @GetMapping("/{id}")
    public Optional<VacationTypeEntity> findVacationTypeById(@PathVariable("id") Long id){
        return vacationTypeService.findById(id);
    }

    @PostMapping
    public VacationTypeEntity saveVacationType(@RequestBody VacationTypeEntity vacationType){
        return vacationTypeService.saveVacationType(vacationType);
    }

    @PutMapping
    public VacationTypeEntity updateVacationType(@RequestBody VacationTypeEntity vacationType){
        return vacationTypeService.updateVacationType(vacationType);
    }

    @DeleteMapping("/{id}")
    public void deleteVacationType(@PathVariable("id") Long id){
        vacationTypeService.deleteVacationType(id);
    }
}
