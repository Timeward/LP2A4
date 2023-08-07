package ifsp.timeward.Restaurante.Controllers;

import ifsp.timeward.Restaurante.DTOs.*;
import ifsp.timeward.Restaurante.Model.Dish;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Menu")
public class MenuController {
    private List<Dish> dishList = new ArrayList<>();

    @GetMapping
    public List<MenuResponseDTO> getAll(){
        dishList.add(new Dish(1L, "Carbonara", "Macarrão", 29.99));
        return (dishList.stream().map(MenuResponseDTO :: new).toList());
    }

    @PostMapping
    public void addDish(@RequestBody MenuRequestDTO r){
        dishList.add(new Dish(r));
    }
}
