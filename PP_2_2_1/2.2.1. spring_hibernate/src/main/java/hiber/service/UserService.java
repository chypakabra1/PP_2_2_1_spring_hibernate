package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void add(User user);

    //@Transactional
    //void add(Car car);

    List<User> listUsers();

    //List<Car> listCars();

    User getUserByCar(String model, int series);
}
