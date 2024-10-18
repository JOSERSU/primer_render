package com.upiiz.promotions.services;

import com.upiiz.promotions.models.Promotion;
import com.upiiz.promotions.repository.PromotionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionsService {
    //rEQUERIMOS EL REPO DE (DATOS-LISTADO) DE CATEGORIAS)
    PromotionsRepository promotionsRepository;

    //Constructor -cuando creo ella instancia le pasa el repositorio
    public PromotionsService(PromotionsRepository promotionsRepository){
        this.promotionsRepository = promotionsRepository;
    }

    //Get promotions
    public List<Promotion> getAllpromotions(){
        return promotionsRepository.obtenerPromotions();
    }

    public Promotion getPromotionById(Long id){
        return promotionsRepository.obntenerPromotionById(id);
    }

    public Promotion createPromotion(Promotion promotion){
        return promotionsRepository.guardar(promotion);
    }

    public Promotion updatePromotion(Promotion categoria){
        return promotionsRepository.actualizarPromotion(categoria);
    }

    public void deletePromotion(Long id){
        promotionsRepository.eliminarPromotion(id);
    }
}
