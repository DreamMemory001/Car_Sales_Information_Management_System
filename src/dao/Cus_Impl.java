package dao;

import bean.Custom;
import bean.Staff;

import java.util.List;

public interface Cus_Impl {
    List<Custom> selectAll(int page);
    int deleteOne(Custom custom);
    int insertOne(Custom custom);
    Custom selectOne(Custom custom);
    int updateOne(Custom custom);
    List<Custom> contain(String ser1);
    List<Custom> contain2(String ser2);
    int CoutPage();
}
