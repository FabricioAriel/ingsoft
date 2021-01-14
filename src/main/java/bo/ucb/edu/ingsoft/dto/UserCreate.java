package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;

@Service
public class UserCreate {
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;

    private String lastname;
    private String phone;
    private String email;
    private String password;
    private Integer neighbourId;
    private String street;
    private String number;
    private String reference;

    public UserCreate(){
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Integer getNeighbourId() { return neighbourId; }
    public void setNeighbourId(Integer neighbourId) { this.neighbourId = neighbourId; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    @Override
    public String toString() {
        return "UserCreate{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", neighbourId=" + neighbourId +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
