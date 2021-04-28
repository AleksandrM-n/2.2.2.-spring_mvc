package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Volkswagen Tiguan II", 2021, 2_042_000));
        carList.add(new Car("Nissan Qashqai II", 2021, 1_976_000));
        carList.add(new Car("BMW 5 series VII", 2021, 4_400_600));
        carList.add(new Car("Jaguar F-Pace I", 2021,5_411_000));
        carList.add(new Car("Mercedes-Benz C-Class IV", 2021, 3_677_600));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer count,
                            ModelMap model) {

        List<String> messages = new ArrayList<>();

        count = (count == null) || (count > 5) ? 5 : count;

        for(int i = 0; i < count; i++) {
            messages.add(carList.get(i).toString());
            messages.add("");
        }

        model.addAttribute("printCars", messages);
        return "cars";
    }
}
