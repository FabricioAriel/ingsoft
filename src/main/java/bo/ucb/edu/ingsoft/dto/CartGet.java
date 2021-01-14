package bo.ucb.edu.ingsoft.dto;

import java.math.BigDecimal;

public class CartGet {
    private Integer cartId;
    private Integer isActive;
    private BigDecimal total;
    public CartGet(){

    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CartGet{" +
                "cartId=" + cartId +
                ", isActive=" + isActive +
                ", total=" + total +
                '}';
    }
}
