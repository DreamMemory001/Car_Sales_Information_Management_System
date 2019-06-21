package daoImpl;

import bean.Root;
import dao.Root_Impl;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RootDao implements Root_Impl {
    @Override
    public boolean selectOne(Root root) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from root where username=?;";
        PreparedStatement ps  = DBUtil.getPreparedStatement(conn, sql);
        ResultSet rs = null;
        try{
            ps.setString(1, root.getUsername());
            rs = ps.executeQuery();
            while (rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(rs,ps,conn);
        }
        return false;
    }

    @Override
    public int insertOne(Root root) {
        String sql  = "insert into root(username, password) values(?,?);";
        Object[] obj = {root.getUsername(), root.getPassword()};
        int rs = DBUtil.excuteDML(sql, obj);
        return rs;
    }
}
