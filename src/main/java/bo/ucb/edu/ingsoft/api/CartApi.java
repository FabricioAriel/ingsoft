package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CartBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.model.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController

public class CartApi {
    private TransactionBl transactionBl;
    private CartBl cartBl;


    @Autowired
    public CartApi(TransactionBl transactionBl, CartBl cartBl){
        this.transactionBl = transactionBl;
        this.cartBl = cartBl;
    }

    @RequestMapping(value = "/cartDetail", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public CartDetailAdd createCartDetail(@Valid @RequestBody CartDetailAdd cartDetailAdd, CartDetail cartDetail, Product product, Cart cart, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        CartDetailAdd cartResponse = cartBl.createCartDetail(cartDetailAdd,cartDetail,product,cart, transaction);
        return cartResponse;
    }

    @RequestMapping(value = "/cartDetail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<CartGetDetail> getCartDetail(HttpServletRequest request) {
        return cartBl.getCartDetail();
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<CartGet> getCart(HttpServletRequest request ) {
        return cartBl.getCart();
    }

    @RequestMapping(value = "/cart", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public CartAdd createCart(@RequestBody  Cart cart,CartAdd cartAdd, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        CartAdd cartResponse = cartBl.createCart(cart, transaction,cartAdd);
        return cartResponse;
    }

    @RequestMapping(value = "/cartDetail/{cartDetailId}", method = RequestMethod.PATCH, produces = MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public CartDetailDelete deleteCartDetail ( @RequestBody CartDetail cartDetail, CartDetailDelete cartDetailDelete, HttpServletRequest request, @PathVariable int cartDetailId){

        CartDetailDelete productResponse = cartBl.deleteCartDetail(cartDetailDelete, cartDetailId);
        return productResponse;
    }
}
