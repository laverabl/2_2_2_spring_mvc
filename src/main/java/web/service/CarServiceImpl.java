package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDAO carDAO;
    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            count = 0;
        } else if (count >= 5) {
            count = 5;
        }
        return carDAO.getCar(count).stream().limit(count).toList();
    }
}
