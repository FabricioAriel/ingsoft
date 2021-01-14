package bo.ucb.edu.ingsoft.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CartDetailAdd {
    private Integer cartId;
    private Integer productId;
    @NotNull (message = "el campo no debe estar vacio")
    @Min(value = 1,message = "la cantidad minima para solicitar el producto es 1")
    @Max(value = 10, message = "la cantidad maxima que puede que puedes pedir de este producto es 10")
    private Integer qtty;

    public CartDetailAdd() {
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQtty() {
        return qtty;
    }

    public void setQtty(Integer qtty) {
        this.qtty = qtty;
    }

    @Override
    public String toString() {
        return "CartDetailAdd{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", qtty=" + qtty +
                '}';
    }
}
