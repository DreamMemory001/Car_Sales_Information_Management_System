package dao;

import bean.Staff;

import java.util.List;

public interface Staff_Impl {

    List<Staff> selectAll(int page);
    int deleteOne(Staff staff);
    int insertOne(Staff staff);
    Staff selectOne(Staff staff);
    int updateOne(Staff staff);
    List<Staff> contain(String ser1);
    List<Staff> contain2(String ser2);
    int CoutPage();

}
