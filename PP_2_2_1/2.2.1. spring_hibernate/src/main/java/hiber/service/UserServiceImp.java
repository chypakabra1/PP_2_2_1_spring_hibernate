package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   /*@Transactional
   @Override
   public void add(Car car) {
      userDao.add(car);
   }*/

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   /*@Transactional(readOnly = true)
   @Override
   public List<Car> listCars() {
      return userDao.listCars();
   }*/

   @Transactional(readOnly = true)
   @Override
   public User getUserByCar(String model, int series) {
      return userDao.getUserByCar(model, series);
   }

}
