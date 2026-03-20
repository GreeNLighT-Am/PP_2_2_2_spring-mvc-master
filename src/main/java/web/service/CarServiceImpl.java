package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        return carDao.getCarsByCount(cars, count);
    }
}
