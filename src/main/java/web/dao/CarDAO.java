package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCar(int count);
}
