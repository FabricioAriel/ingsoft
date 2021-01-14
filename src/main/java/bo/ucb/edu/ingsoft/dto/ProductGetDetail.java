package bo.ucb.edu.ingsoft.dto;

import java.math.BigDecimal;

public class ProductGetDetail {
    private Integer productId;
    private String image;
    private BigDecimal price;
    private String productName;
    private String model;
    private String Description;
    private String Detail;
    private String category;
    private String brand;
    private Boolean storeAvailable;
    private Boolean deliveryAvailable;
    public ProductGetDetail(){

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getStoreAvailable() {
        return storeAvailable;
    }

    public void setStoreAvailable(Boolean storeAvailable) {
        this.storeAvailable = storeAvailable;
    }

    public Boolean getDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void setDeliveryAvailable(Boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }

    @Override
    public String toString() {
        return "ProductGetDetail{" +
                "productId=" + productId +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                ", model='" + model + '\'' +
                ", Description='" + Description + '\'' +
                ", Detail='" + Detail + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", storeAvailable=" + storeAvailable +
                ", deliveryAvailable=" + deliveryAvailable +
                '}';
    }
}
