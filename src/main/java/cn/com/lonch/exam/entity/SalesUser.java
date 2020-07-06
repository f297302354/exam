package cn.com.lonch.exam.entity;

/**
 * 销售用户表
 * @author fei.chang
 */
public class SalesUser {

    /**
     * 主键
     */
    private int id;

    /**
     * 销售人员姓名
     */
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
