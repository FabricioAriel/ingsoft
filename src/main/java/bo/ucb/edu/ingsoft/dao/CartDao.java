package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.CartDetailDelete;
import bo.ucb.edu.ingsoft.dto.CartGet;
import bo.ucb.edu.ingsoft.dto.CartGetDetail;
import bo.ucb.edu.ingsoft.model.Cart;
import bo.ucb.edu.ingsoft.model.CartDetail;
import bo.ucb.edu.ingsoft.model.Order;
import bo.ucb.edu.ingsoft.model.Product;
import jdk.dynalink.linker.LinkerServices;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDao {

    public void createCartDetail(CartDetail cartDetail);

    public List<CartGetDetail> getCartDetail();

    public List<CartGet> getCart(Integer cartId);

    public  void createCart(Cart cart);

    public void deleteCartDetail(Integer cartDetailId);

    public List<CartGet> getCart();

}
