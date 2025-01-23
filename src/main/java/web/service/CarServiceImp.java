package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = List.of(
            new Car("BMW", 2000, 240L),
            new Car("Mercedes", 2010, 310L),
            new Car("Haval", 2022, 500L),
            new Car("Volga", 2005, 140L),
            new Car("Skoda", 2015, 200L)
    );


    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}