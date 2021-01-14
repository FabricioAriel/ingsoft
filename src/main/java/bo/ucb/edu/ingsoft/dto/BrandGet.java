package bo.ucb.edu.ingsoft.dto;

public class BrandGet {
    private Integer brandId;
    private String name;
    public BrandGet(){

    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BrandGet{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                '}';
    }
}
