package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PaymentBl;
import bo.ucb.edu.ingsoft.bl.ProductBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.PaymentAdd;
import bo.ucb.edu.ingsoft.dto.ProductAdd;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.model.Brand;
import bo.ucb.edu.ingsoft.model.Product;
import bo.ucb.edu.ingsoft.model.Tag;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/payment")
public class PaymentApi {
    private TransactionBl transactionBl;
    private PaymentBl paymentBl;

    @Autowired
    public PaymentApi(TransactionBl transactionBl,PaymentBl paymentBl){
        this.transactionBl = transactionBl;
        this.paymentBl = paymentBl;
    }

    @RequestMapping( method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public PaymentAdd createPayment(@Valid @RequestBody  PaymentAdd paymentAdd, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        PaymentAdd paymentResponse = paymentBl.createPayment(paymentAdd,transaction);
        return paymentResponse;
    }
}
