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
    public List<Sale> selectAll() {
        ResultSet rs = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from sale;";
        List<Sale> list = new ArrayList<>();
        PreparedStatement pst = DBUtil.getPreparedStatement(conn, sql);
        try{
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
}
