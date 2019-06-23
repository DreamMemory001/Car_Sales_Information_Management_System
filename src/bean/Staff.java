package bean;

public class Staff {
    /**
     * create by XuChao
     * 2019/06/16
     */
    /**
     * 1.员工姓名
     * 2.员工性别
     * 3.员工住址
     * 4.员工手机号码
     */

    private String sta_name;
    private String sta_sex;
    private String sta_adress;
    private String sta_phoneNumber;
    private String sta_id;
    public static final int PAGE_SIZE = 3;

    public String getSta_name() {
        return sta_name;
    }

    public void setSta_name(String sta_name) {
        this.sta_name = sta_name;
    }

    public String getSta_sex() {
        return sta_sex;
    }

    public void setSta_sex(String sta_sex) {
        this.sta_sex = sta_sex;
    }

    public String getSta_adress() {
        return sta_adress;
    }

    public void setSta_adress(String sta_adress) {
        this.sta_adress = sta_adress;
    }

    public String getSta_phoneNumber() {
        return sta_phoneNumber;
    }

    public void setSta_phoneNumber(String sta_phoneNumber) {
        this.sta_phoneNumber = sta_phoneNumber;
    }

    public String getSta_id() {
        return sta_id;
    }

    public void setSta_id(String sta_id) {
        this.sta_id = sta_id;
    }
}
