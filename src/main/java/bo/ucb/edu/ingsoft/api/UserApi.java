package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;

import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.model.Address;
import bo.ucb.edu.ingsoft.model.Order;

import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class UserApi {

    private UserBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public UserApi(UserBl userBl, TransactionBl transactionBl){
        this.userBl = userBl;
        this.transactionBl = transactionBl;
    }

    //RequestMapping POST para la creacion de Usuarios
    @RequestMapping(path = "users/signup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public UserCreate createUser(@Valid @RequestBody UserCreate userCreate, User user, Address address, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        UserCreate userResponse = userBl.createUser(userCreate, user, transaction, address);

        return userResponse;
    }

    //RequestMapping PATCH para la modificacion de usuarios
    //PathVariable obtiene el Id del usuario desde el path
    @RequestMapping(path = "users/edit/{userId}", method = RequestMethod.PATCH, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public UserUpdate updateUser(@RequestBody UserUpdate userUpdate, User user, Address address, HttpServletRequest request, @PathVariable int userId){

        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        UserUpdate userResponse = userBl.updateUser(userUpdate, user, transaction, address, userId);

        return userResponse;

    }

    //RequestMapping GET para la obtencion de datos del usuario
    //PathVariable obtiene el Id del usuario
    @RequestMapping(path = "users/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<UserGet> findUserById(HttpServletRequest request, @PathVariable int userId){
        return userBl.findUserById(userId);
    }

    @RequestMapping(path = "users/{userId}/orders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<UserOrderGet> findOrdersByUserId(HttpServletRequest request, @PathVariable int userId){
        return userBl.findOrdersByUserId(userId);
    }

    @RequestMapping(path = "users/{userId}/orders/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<UserGetOrderId> findOrderByOrderId(HttpServletRequest request, @PathVariable int orderId, @PathVariable int userId){
        return userBl.findOrderByOrderId(userId, orderId);
    }

    @RequestMapping(path = "neighbour", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<NieghbourGet> findNeighbour(HttpServletRequest request){
        return userBl.findNeighbour();
    }
}
