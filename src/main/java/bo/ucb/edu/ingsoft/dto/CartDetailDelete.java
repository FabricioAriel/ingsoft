package bo.ucb.edu.ingsoft.dto;


public class CartDetailDelete {
    private Integer cartDetailId;
    public CartDetailDelete(){

    }

    public Integer getCartDetailId() {
        return cartDetailId;
    }

    public void setCartDetailId(Integer cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    @Override
    public String toString() {
        return "CartDetailDelete{" +
                "cartDetailId=" + cartDetailId +
                '}';
    }
}
