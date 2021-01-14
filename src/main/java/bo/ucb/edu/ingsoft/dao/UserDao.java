package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.UserGetOrderId;
import bo.ucb.edu.ingsoft.dto.UserOrderGet;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.dto.UserGet;
import bo.ucb.edu.ingsoft.dto.NieghbourGet;
import bo.ucb.edu.ingsoft.model.Order;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    //Creacion de Usuarios
    public void create(User user);

    //Get de usuario por Id
    public List<UserGet> findUserById(Integer userId);

    //GET de los pedidos realizados por el usuario
    public List<UserOrderGet> findOrdersByUserId(Integer userId);

    //GET de los pedidos realizados por el usuario
    public List<UserGetOrderId> findOrderByOrderId(Integer userId,Integer orderId);

    //GET datos de nieghbour
    public List<NieghbourGet> findNeighbour();

    //Actualizacion de datos de usuario
    public void update(User user);
    public Integer selectAddressId(Integer userId);



}

