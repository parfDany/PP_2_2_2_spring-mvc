package web.controller;

import Service.CarsModels;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarsModels carsModels = new CarsModels();


    @GetMapping(value = "/cars")
    public String getAllCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("car", carsModels.getCarList(count));
        return "car";
    }
}