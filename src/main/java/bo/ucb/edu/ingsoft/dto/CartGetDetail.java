package bo.ucb.edu.ingsoft.dto;

import java.math.BigDecimal;

public class CartGetDetail {
    private Integer cartDetailId;
    private String image;
    private String productName;
    private String model;
    private Integer qtty;
    private BigDecimal price;
    public CartGetDetail(){

    }

    public Integer getCartDetailId() {
        return cartDetailId;
    }

    public void setCartDetailId(Integer cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getQtty() {
        return qtty;
    }

    public void setQtty(Integer qtty) {
        this.qtty = qtty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartGetDetail{" +
                "cartDetailId=" + cartDetailId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", model='" + model + '\'' +
                ", qtty=" + qtty +
                ", price=" + price +
                '}';
    }
}
