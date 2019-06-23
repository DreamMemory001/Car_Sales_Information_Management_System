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
    public List<Car> selectALL(int page) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from car order by carid desc limit ?,?;";
        List<Car> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
            pst.setInt(1, (page - 1) * Car.PAGE_SIZE);
            pst.setInt(2, Car.PAGE_SIZE);
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
    public List<Car> contain(String ser1) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from car where cartype like ?;";
        List<Car> list = new ArrayList<>();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,"%"+ser1+"%");
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<Car> contain2(String ser2) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from car where carbrand like ?;";
        List<Car> list = new ArrayList<>();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,"%"+ser2+"%");
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

    @Override
    public int CoutPage() {
        ResultSet rs = null;
        int count = 0 ;
        String sql = "select count(*) from car";
        Connection con = DBUtil.getConnection();
        PreparedStatement pst =DBUtil.getPreparedStatement(con,sql);
        try{
            rs = pst.executeQuery();
            while (rs.next()){
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(rs,pst,con);
        }
        return count;

    }


}
