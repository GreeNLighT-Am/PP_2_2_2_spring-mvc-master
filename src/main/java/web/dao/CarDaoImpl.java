package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        return List.of(
                Car.builder()
                        .model("Corolla")
                        .series("E150")
                        .color("Silver")
                        .build(),
                Car.builder()
                        .model("Audi")
                        .series("A8")
                        .color("Black")
                        .build(),
                Car.builder()
                        .model("Subaru")
                        .series("Impreza")
                        .color("Blue")
                        .build(),
                Car.builder()
                        .model("Toyota")
                        .series("Camry")
                        .color("Black")
                        .build(),
                Car.builder()
                        .model("Toyota")
                        .series("Prado")
                        .color("Black")
                        .build()
        );
    }

    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
