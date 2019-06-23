package daoImpl;

import bean.Custom;
import bean.Staff;
import dao.Cus_Impl;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomDao implements Cus_Impl {
    @Override
    public List<Custom> selectAll(int page) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from custom order by cusid desc limit ?,?;";
        List<Custom> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
            pst.setInt(1, (page - 1) * Custom.PAGE_SIZE);
            pst.setInt(2, Custom.PAGE_SIZE);
            rs = pst.executeQuery();
            while (rs.next()){
               Custom custom = new Custom();
               custom.setCus_id(rs.getString("cusid"));
               custom.setCus_name(rs.getString("cusname"));
               custom.setCus_sex(rs.getString("cussex"));
               custom.setCus_type(rs.getString("custype"));
               custom.setCus_phoneNumber(rs.getString("cusphonum"));
               list.add(custom);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(rs,pst,conn);
        }
        return list;
    }

    @Override
    public int deleteOne(Custom custom) {
        int rs = 0 ;
        String sql = "delete from custom where cusid=?;";
        Object[] obj = {custom.getCus_id()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs;
    }

    @Override
    public int insertOne(Custom custom) {
        int rs = 0;
        String sql = "insert into custom values(?,?,?,?,?);";
        Object [] obj = {custom.getCus_id(),custom.getCus_name(),custom.getCus_sex(),custom.getCus_type(),custom.getCus_phoneNumber()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs ;
    }

    @Override
    public Custom selectOne(Custom custom) {
        ResultSet rs = null;
        String sql = "select * from custom where cusid=?";
        Connection con = DBUtil.getConnection();
        PreparedStatement pst = DBUtil.getPreparedStatement(con, sql);
         Custom custom1 = new Custom();
        try {
            pst.setString(1, custom.getCus_id());
            rs = pst.executeQuery();
            while (rs.next()){
              custom1.setCus_id(rs.getString("cusid"));
              custom1.setCus_name(rs.getString("cusname"));
              custom1.setCus_sex(rs.getString("cussex"));
              custom1.setCus_type(rs.getString("custype"));
              custom1.setCus_phoneNumber(rs.getString("cusphonum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return custom1;
    }

    @Override
    public int updateOne(Custom custom) {
        int rs = 0 ;
        String sql = "update custom set cusname=?,cussex=?,custype=?,cusphonum=? where cusid=?;";
        Object [] object = {custom.getCus_name(),custom.getCus_sex(),custom.getCus_type(),custom.getCus_phoneNumber(),custom.getCus_id()};
        rs = DBUtil.excuteDML(sql,object);
        return rs;
    }

    @Override
    public List<Custom> contain(String ser1) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from custom where cusname like ?;";
        List<Custom> list = new ArrayList<>();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,"%"+ser1+"%");
            rs = pst.executeQuery();
            while (rs.next()){
               Custom custom = new Custom();
                custom.setCus_id(rs.getString("cusid"));
                custom.setCus_name(rs.getString("cusname"));
                custom.setCus_sex(rs.getString("cussex"));
                custom.setCus_type(rs.getString("custype"));
                custom.setCus_phoneNumber(rs.getString("cusphonum"));
                list.add(custom);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Custom> contain2(String ser2) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from custom where cusphonum like ?;";
        List<Custom> list = new ArrayList<>();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,"%"+ser2+"%");
            rs = pst.executeQuery();
            while (rs.next()){
                Custom custom = new Custom();
                custom.setCus_id(rs.getString("cusid"));
                custom.setCus_name(rs.getString("cusname"));
                custom.setCus_sex(rs.getString("cussex"));
                custom.setCus_type(rs.getString("custype"));
                custom.setCus_phoneNumber(rs.getString("cusphonum"));
                list.add(custom);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int CoutPage() {
        ResultSet rs = null;
        int count = 0 ;
        String sql = "select count(*) from custom";
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
