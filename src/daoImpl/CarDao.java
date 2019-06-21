package daoImpl;

import bean.Car;
import bean.Sale;
import dao.Car_Impl;
import org.omg.CORBA.OBJ_ADAPTER;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDao implements Car_Impl {

    @Override
    public List<Car> selectALL() {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from car;";
        List<Car> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
            rs = pst.executeQuery();
            while (rs.next()){
                Car car1 = new Car();
                car1.setCar_id(rs.getString("carid"));
                car1.setCar_name(rs.getString("carname"));
                car1.setCar_type(rs.getString("cartype"));
                car1.setCar_brand(rs.getString("carbrand"));
                car1.setCar_price(rs.getFloat("carprice"));
                list.add(car1);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(rs,pst,conn);
        }
        return list;
    }

    @Override
    public int deleteCar(Car car) {
        int rs = 0 ;
        String sql = "delete from car where carid=?;";
        Object[] obj = {car.getCar_id()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs;
    }

    @Override
    public int updateCar(Car car){
       int rs = 0;
       String sql  = "update car set carname=?,cartype=?,carbrand=?,carprice=? where carid=?;";
       Object [] obj = {car.getCar_name(), car.getCar_type(), car.getCar_brand(), car.getCar_price(),car.getCar_id()};
       rs = DBUtil.excuteDML(sql, obj);
      return rs;
    }



    @Override
    public int insertCar(Car car) {
        int rs = 0;
        String sql = "insert into car values(?,?,?,?,?);";
        Object [] obj = {car.getCar_id(), car.getCar_name(),car.getCar_brand(), car.getCar_price(),car.getCar_price()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs ;

    }

    @Override
    public Car selectOne(Car car) {
        ResultSet rs = null;
        String sql = "select * from car where carid=?";
        Connection con = DBUtil.getConnection();
        PreparedStatement pst = DBUtil.getPreparedStatement(con, sql);
        Car car1 = new Car();
        try {
            pst.setString(1, car.getCar_id());
            rs = pst.executeQuery();
            while (rs.next()){
                car1.setCar_id(rs.getString("carid"));
                car1.setCar_name(rs.getString("carname"));
                car1.setCar_type(rs.getString("cartype"));
                car1.setCar_brand(rs.getString("carbrand"));
                car1.setCar_price(rs.getFloat("carprice"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car1;

    }

    @Override
    public List<Car> contain(String ser, String row) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from car where ? like ?;";
        List<Car> list = new ArrayList<>();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, row);
            pst.setString(2,"%"+ser+"%");


            rs = pst.executeQuery();
            while (rs.next()){
                Car car1 = new Car();
                car1.setCar_id(rs.getString("carid"));
                System.out.println(car1.getCar_id());
                car1.setCar_name(rs.getString("carname"));
                car1.setCar_type(rs.getString("cartype"));
                car1.setCar_brand(rs.getString("carbrand"));
                car1.setCar_price(rs.getFloat("carprice"));
                list.add(car1);
            }




            System.out.println("hh"+row);
            System.out.println(ser);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public int buycar(Sale sale) {
        int rs = 0;
        String sql = "insert into sale values(?,?,?);";
        Object [] obj = {sale.getSale_no(),sale.getCar_name(),sale.getSale_num()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs;
    }


}
