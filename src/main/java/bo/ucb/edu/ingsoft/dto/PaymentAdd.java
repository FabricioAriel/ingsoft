package bo.ucb.edu.ingsoft.dto;

import java.util.Date;
import javax.validation.constraints.*;


public class PaymentAdd {
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;
    @NotBlank(message = "Lastname is mandatory")
    private String lastname;
    @NotBlank(message = "Cardnumber is mandatory")
    @Size(min = 16, max = 16, message
            = "About Me must be between 16 and 16 characters")
    private Integer cardNumber;
    @NotBlank(message = "Securitycode is mandatory")
    @Size(min = 3, max = 3, message
            = "About Me must be between 16 and 16 characters")
    private Integer securityCode;
    @NotNull(message = "no puede estar vacio")
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
