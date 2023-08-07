package ifsp.timeward.Restaurante.DTOs;

import ifsp.timeward.Restaurante.Model.Dish;

public record MenuResponseDTO(Long id, String name, String description, Double price) {

    public MenuResponseDTO(Dish e){
        this(e.getId(), e.getName(), e.getDescription(), e.getPrice());
    }
}
