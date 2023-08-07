package ifsp.timeward.Restaurante.Model;


import ifsp.timeward.Restaurante.DTOs.MenuRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private Long id;
    private String name;
    private String description;
    private Double price;

    public Dish(MenuRequestDTO r) {
        name = r.name();
        description = r.description();
        price = r.price();
    }
}
