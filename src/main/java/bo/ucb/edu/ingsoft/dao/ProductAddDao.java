package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductAddDao {
    public void create(Product product);
}
