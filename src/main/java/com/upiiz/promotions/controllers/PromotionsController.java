package com.upiiz.promotions.controllers;

import com.upiiz.promotions.models.Promotion;
import com.upiiz.promotions.services.PromotionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/promotions")
public class PromotionsController {
    //Requiero inyectar el servicio
    PromotionsService promotionsService;

    public PromotionsController(PromotionsService promotionsService){
        this.promotionsService = promotionsService;
    }

    //Get de todas
    @GetMapping
    public ResponseEntity<List<Promotion>> getPromotions(){
        return ResponseEntity.ok(promotionsService.getAllpromotions());
    }

    //Get de una
    @GetMapping("/{id}")
    public ResponseEntity<Promotion> getCategoria(@PathVariable Long id){
        return ResponseEntity.ok(promotionsService.getPromotionById(id));
    }

    //Post - crear una cat
    @PostMapping
    public ResponseEntity<Promotion> addCategoria(@RequestBody Promotion promotion){
        return ResponseEntity.ok(promotionsService.createPromotion(promotion));
    }

    //PUT - actualizar una cat
    @PutMapping("/{id}")
    public ResponseEntity<Promotion> updateCategoria(@RequestBody Promotion promotion, @PathVariable Long id){
        promotion.setId(id);
        return ResponseEntity.ok(promotionsService.updatePromotion(promotion));
    }

    //Delete - elimibnar una cat
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCetegoria(@PathVariable Long id){
        promotionsService.deletePromotion(id);
        return ResponseEntity.noContent().build();
    }
}
