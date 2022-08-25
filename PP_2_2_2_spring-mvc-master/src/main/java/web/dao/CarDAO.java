package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, 123, "lada"));
        cars.add(new Car(2, 123, "lada"));
        cars.add(new Car(3, 123, "lada"));
        cars.add(new Car(4, 123, "lada"));
        cars.add(new Car(5, 123, "lada"));

    }

    public List<Car> show(int i) {
        return cars.stream()
                .filter(s -> s.getId() <= i)
                .collect(Collectors.toList());
    }
}
