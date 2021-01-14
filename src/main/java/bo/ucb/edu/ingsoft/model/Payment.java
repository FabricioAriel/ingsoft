package bo.ucb.edu.ingsoft.model;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import java.util.Date;
@Service
public class Payment {
    private Integer paymentId;
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;
    private String lastname;
    private Integer cardNumber;
    private Integer securityCode;
    private Date dateExpire;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public Payment() {

    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public Integer getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(Integer txStatus) {
        this.txStatus = txStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cardNumber=" + cardNumber +
                ", securityCode=" + securityCode +
                ", dateExpire=" + dateExpire +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                ", txStatus=" + txStatus +
                '}';
    }
}
