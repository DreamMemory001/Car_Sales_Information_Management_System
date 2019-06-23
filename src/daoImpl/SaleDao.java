package daoImpl;

import bean.Car;
import bean.Sale;
import dao.Sale_Impl;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SaleDao implements Sale_Impl {
    @Override
    public List<Sale> selectAll(int page) {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from sale order by saleno desc limit ?,?;";
        List<Sale> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
            pst.setInt(1, (page - 1) * Sale.PAGE_SIZE);
            pst.setInt(2,Sale.PAGE_SIZE);
            rs = pst.executeQuery();
            while (rs.next()){
               Sale sale = new Sale();
               sale.setSale_no(rs.getString("saleno"));
               sale.setCar_name(rs.getString("carname"));
               sale.setSale_num(rs.getInt("salenum"));
               list.add(sale);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(rs,pst,conn);
        }
        return list;
    }

    @Override
    public int deleteOne(Sale sale) {
        int rs = 0 ;
        String sql = "delete from sale where saleno=?;";
        Object[] obj = {sale.getSale_no()};
        rs = DBUtil.excuteDML(sql, obj);
        return rs;


    }

    @Override
    public Sale selectOne(Sale sale) {
        ResultSet rs = null;
        String sql = "select * from sale where saleno=?";
        Connection con = DBUtil.getConnection();
        PreparedStatement pst = DBUtil.getPreparedStatement(con, sql);
        Sale sale1 = new Sale();
        try {
            pst.setString(1, sale.getSale_no());
            rs = pst.executeQuery();
            while (rs.next()){
                sale1.setSale_no(rs.getString("saleno"));
                sale1.setCar_name(rs.getString("carname"));
                sale1.setSale_num(rs.getInt("salenum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sale1;
    }

    @Override
    public int updateOne(Sale sale) {
       int rs = 0 ;
       String sql = "update sale set carname=?,salenum=? where saleno=?;";
       Object [] objects = {sale.getCar_name(), sale.getSale_num(),sale.getSale_no()};
       rs = DBUtil.excuteDML(sql,objects);

       return rs;
    }

    @Override
    public List<Sale> conatin(String ser) {
        ResultSet rs = null;
        List<Sale> list = new ArrayList<>();
        String sql = "select * from sale where saleno like ?";
        Connection conn = DBUtil.getConnection();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1,row);
            pst.setString(1,"%"+ser+"%");
            rs = pst.executeQuery();
            while(rs.next()){
              Sale sale = new Sale();
                sale.setSale_no(rs.getString("saleno"));
                sale.setCar_name(rs.getString("carname"));
                sale.setSale_num(rs.getInt("salenum"));
                list.add(sale);
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
        String sql = "select count(*) from sale;";
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
