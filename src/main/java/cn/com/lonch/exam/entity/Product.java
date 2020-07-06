package cn.com.lonch.exam.entity;

/**
 * 主键
 * @author fei.chang
 */
public class Product {

    /**
     * 主键
     */
    private int id;

    /**
     * 产品名称
     */
    private String productName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
