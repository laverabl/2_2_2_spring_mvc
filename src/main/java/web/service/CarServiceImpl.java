package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    @Autowired
    CarDAO carDAO;
    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            count = 0;
        } else if (count >= 5) {
            count = 5;
        }
        return carDAO.getCar(count);
    }
}
