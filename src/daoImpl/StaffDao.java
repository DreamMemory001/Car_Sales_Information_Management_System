package daoImpl;

import bean.Car;
import bean.Sale;
import bean.Staff;
import dao.Staff_Impl;
import sun.security.pkcs11.Secmod;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StaffDao implements Staff_Impl {
    @Override
    public List<Staff> selectAll() {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from staff;";
        List<Staff> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
            rs = pst.executeQuery();
            while (rs.next()){
             Staff staff = new Staff();
             staff.setSta_id(rs.getString("staid"));
             staff.setSta_name(rs.getString("staname"));
             staff.setSta_sex(rs.getString("stasex"));
             staff.setSta_adress(rs.getString("staadress"));
             staff.setSta_phoneNumber(rs.getString("staphonum"));
             list.add(staff);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(rs,pst,conn);
        }
        return list;
    }

    @Override
    public int deleteOne(Staff staff) {
        int rs = 0 ;
        String sql = "delete from staff where staid=?;";
        Object[] obj = {staff.getSta_id()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs;
    }

    @Override
    public int insertOne(Staff staff) {
        int rs = 0;
        String sql = "insert into staff values(?,?,?,?,?);";
        Object [] obj = {staff.getSta_id(),staff.getSta_name(),staff.getSta_sex(),staff.getSta_adress(),staff.getSta_phoneNumber()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs ;
    }

    @Override
    public Staff selectOne(Staff staff) {
        ResultSet rs = null;
        String sql = "select * from staff where staid=?";
        Connection con = DBUtil.getConnection();
        PreparedStatement pst = DBUtil.getPreparedStatement(con, sql);
        Staff staff1 = new Staff();
        try {
            pst.setString(1, staff.getSta_id());
            rs = pst.executeQuery();
            while (rs.next()){
                staff1.setSta_id(rs.getString("staid"));
                staff1.setSta_name(rs.getString("staname"));
                staff1.setSta_sex(rs.getString("stasex"));
                staff1.setSta_adress(rs.getString("staadress"));
                staff1.setSta_phoneNumber(rs.getString("staphonum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staff1;
    }

    @Override
    public int updateOne(Staff staff) {
        int rs = 0 ;
        String sql = "update staff set staname=?,stasex=?,staadress=?,staphonum=? where staid=?;";
        Object [] object = {staff.getSta_name(),staff.getSta_sex(),staff.getSta_adress(),staff.getSta_phoneNumber(),staff.getSta_id()};
        rs = DBUtil.excuteDML(sql,object);
        return rs;

    }

    @Override
    public List<Staff> contain(String ser1) {
        ResultSet rs = null;
        List<Staff> list = new ArrayList<>();
        String sql = "select * from staff where staadress like ?";
        Connection conn = DBUtil.getConnection();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1,row);
            pst.setString(1,"%"+ser1+"%");
            rs = pst.executeQuery();
            while(rs.next()){
                Staff staff = new Staff();
                staff.setSta_id(rs.getString("staid"));
                staff.setSta_name(rs.getString("staname"));
                staff.setSta_sex(rs.getString("stasex"));
                staff.setSta_adress(rs.getString("staadress"));
                staff.setSta_phoneNumber(rs.getString("staphonum"));
                list.add(staff);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Staff> contain2(String ser2) {
        ResultSet rs = null;
        List<Staff> list = new ArrayList<>();
        String sql = "select * from staff where staphonum like ?";
        Connection conn = DBUtil.getConnection();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1,row);
            pst.setString(1,"%"+ser2+"%");
            rs = pst.executeQuery();
            while(rs.next()){
                Staff staff = new Staff();
                staff.setSta_id(rs.getString("staid"));
                staff.setSta_name(rs.getString("staname"));
                staff.setSta_sex(rs.getString("stasex"));
                staff.setSta_adress(rs.getString("staadress"));
                staff.setSta_phoneNumber(rs.getString("staphonum"));
                list.add(staff);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
