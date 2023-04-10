package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.CardEntity;
import com.developer.KivSportAPI.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<CardEntity> findAllCard(){
        return cardService.findAllCard();
    }

    @GetMapping("/{id}")
    public Optional<CardEntity> findBankById(@PathVariable("id") Long id){
        return cardService.findById(id);
    }

    @PostMapping
    public CardEntity saveBank(@RequestBody CardEntity card){
        return cardService.saveCard(card);
    }

    @PutMapping
    public CardEntity updateBank(@RequestBody CardEntity card){
        return cardService.updateCard(card);
    }

    @DeleteMapping("/{id}")
    public void deleteBank(@PathVariable("id") Long id){
        cardService.deleteCard(id);
    }
}
