package bo.ucb.edu.ingsoft.dto;

import java.sql.Time;
import java.util.Date;

public class PaymentAdd {
    private String firstname;
    private String lastname;
    private Integer cardNumber;
    private Integer securityCode;
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
