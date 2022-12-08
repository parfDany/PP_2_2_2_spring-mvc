package Service;


import Model.CarConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component
public class CarsModels implements CarInterfaceService {
    public List<CarConstructor> carList;

    {
        carList = new ArrayList<>();
        carList.add(new CarConstructor("Volkswagen", "Red", 150));
        carList.add(new CarConstructor("Audi", "Blue", 249));
        carList.add(new CarConstructor("Man", "Black", 286));
        carList.add(new CarConstructor("Seat", "Yellow", 252));
        carList.add(new CarConstructor("BMW", "Green", 330));
    }

    public List<CarConstructor> getCarList(int count) {
        if (count >= 5 || count <= 0) {
            return this.carList;
        }
        return carList.stream().limit(count).toList();
    }
}

