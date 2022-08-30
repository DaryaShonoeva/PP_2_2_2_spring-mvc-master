package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.services.CarService;


@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/carscount={i}")
    public String printCars(ModelMap model, @PathVariable String i) {
            model.addAttribute("carsId", carService.show(i));
        return "cars";
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("carsId", carService.show(String.valueOf(5)));
        return "cars";
    }
}
