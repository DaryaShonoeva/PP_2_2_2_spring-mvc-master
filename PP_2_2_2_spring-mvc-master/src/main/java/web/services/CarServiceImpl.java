package web.services;

import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    private final CarDAO carDAO = new CarDAO();
    @Override
    public List<Car> show(int i) {
        return carDAO.show(i);
    }
}
