package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.constraints.NotBlank;

@Service
public class PaymentAdd {
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;


    @NotBlank(message = "Lastname is mandatory")
    private String lastname;


    //@NotNull
   //@Size(min = 1, max = 16, message = "About Me must be between 16 and 16 characters")
    @Min(value = 1)
    @Max(value = 5)
    //@Digits(fraction = 0, integer = 16, message ="msg2")
    private Integer cardNumber;


   // @NotNull
   //@Size(min = 1, max = 3, message= "About Me must be between 16 and 16 characters")
    private Integer securityCode;


    //@NotNull(message = "no puede estar vacio")
    private Date dateExpire;

    public PaymentAdd() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(Integer securityCode) {
        this.securityCode = securityCode;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }

    @Override
    public String toString() {
        return "PaymentAdd{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cardNumber=" + cardNumber +
                ", securityCode=" + securityCode +
                ", dateExpire=" + dateExpire +
                '}';
    }
}
