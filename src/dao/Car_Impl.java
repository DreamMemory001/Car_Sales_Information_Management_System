package dao;

import bean.Car;
import bean.Sale;

import java.util.List;

public interface Car_Impl {

    List<Car> selectALL(int page);
    int deleteCar(Car car);
    int updateCar(Car car);
    int insertCar(Car car);
    Car selectOne(Car car);
    List<Car> contain(String ser1);
    List<Car> contain2(String ser2);
    int buycar(Sale sale);
    int CoutPage();
}
