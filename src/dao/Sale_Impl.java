package dao;

import bean.Sale;

import java.util.List;

public interface Sale_Impl {
    List<Sale> selectAll(int page);
    int deleteOne(Sale sale);
    Sale selectOne(Sale sale);
    int updateOne(Sale sale);
    List<Sale> conatin(String ser);
    int CoutPage();
}
