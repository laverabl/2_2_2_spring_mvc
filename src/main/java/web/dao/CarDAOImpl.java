package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements  CarDAO {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Kia", "Rio", 2000));
        cars.add(new Car("Porsche", "Panamera", 2021));
        cars.add(new Car("Nissan", "Juke", 2010));
        cars.add(new Car("Skoda", "Octavia", 2013));
        cars.add(new Car("Jaguar", "XF", 2007));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }

}
