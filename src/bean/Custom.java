package bean;

public class Custom {
    /**
     * create by XuChao
     * 2019/06/16
     */


    /**
     * 1.客户类型
     * 2.客户名字
     * 3.客户性别
     * 4.客户电话
     * 5.客户编号
     */
    private String cus_type;
    private String cus_name;
    private String cus_phoneNumber;
    private String cus_sex;
    private String cus_id;
    public static final int PAGE_SIZE = 3;


    public String getCus_type() {
        return cus_type;
    }

    public void setCus_type(String cus_type) {
        this.cus_type = cus_type;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_phoneNumber() {
        return cus_phoneNumber;
    }

    public void setCus_phoneNumber(String cus_phoneNumber) {
        this.cus_phoneNumber = cus_phoneNumber;
    }


    public String getCus_sex() {
        return cus_sex;
    }

    public void setCus_sex(String cus_sex) {
        this.cus_sex = cus_sex;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }
}
