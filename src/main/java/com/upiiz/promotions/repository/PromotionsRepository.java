package com.upiiz.promotions.repository;

import com.upiiz.promotions.models.Promotion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PromotionsRepository {
    private List<Promotion> promotions = new ArrayList<Promotion>();//Evitar el null pointer exception
    private AtomicLong id = new AtomicLong();

    //GET todas las cat
    public List<Promotion> obtenerPromotions() {
        return promotions;
    }

    //GET solo una cat por id
    public Promotion obntenerPromotionById(Long id){
        return promotions.stream().filter(promotion -> promotion.getId().equals(id)).findFirst().orElse(null);
    }

    //POST
    public Promotion guardar(Promotion promotion){
        promotion.setId(id.incrementAndGet());
        promotions.add(promotion);
        return promotion;
    }

    //Delete
    public void eliminarPromotion(Long id){
        promotions.removeIf(promotion -> promotion.getId().equals(id));
    }

    //PUT
    public Promotion actualizarPromotion(Promotion promotion){
        eliminarPromotion(promotion.getId());
        promotions.add(promotion);
        return promotion;
    }
}
