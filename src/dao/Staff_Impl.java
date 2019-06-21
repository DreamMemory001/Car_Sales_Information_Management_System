package dao;

import bean.Staff;

import java.util.List;

public interface Staff_Impl {

    List<Staff> selectAll();
    int deleteOne(Staff staff);
    int insertOne(Staff staff);
    Staff selectOne(Staff staff);
    int updateOne(Staff staff);
}
