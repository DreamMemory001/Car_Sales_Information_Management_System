package bean;

public class Sale {
    /**
     * create by XuChao
     * 2019/06/16
     */

    /**
     *
     * 1.销售车名称
     * 2.销售车数量
     * 3.订单编号
     */

    private String car_name;
    private int sale_num;
    private String sale_no;

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getSale_num() {
        return sale_num;
    }

    public void setSale_num(int sale_num) {
        this.sale_num = sale_num;
    }


    public String getSale_no() {
        return sale_no;
    }

    public void setSale_no(String sale_no) {
        this.sale_no = sale_no;
    }
}
