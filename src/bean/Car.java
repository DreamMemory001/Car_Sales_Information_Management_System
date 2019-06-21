package bean;

public class Car {
    /**
     * create by XuChao
     * 2019/06/16
     */

    /**
     *
     * 1.汽车现有数量
     * 2.汽车类型
       3.汽车名字
     * 4.汽车品牌
     * 5.汽车id
     */
    private String car_name;
    private String car_type;
    private float car_price;
    private String car_brand;
    private String car_id;


    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public float getCar_price() {
        return car_price;
    }

    public void setCar_price(float car_price) {
        this.car_price = car_price;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }
}
