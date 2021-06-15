package senounta.nikos.models;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.*;


import java.util.List;

@JsonRootName(value = "user")
public class User {

    @Positive
    private Integer id = null;
    @NotNull
    @NotBlank
    private String name = null;
    @NotNull
    @NotBlank
    private String surname = null;
    @NotNull
    @NotBlank
    private String address = null;
    @Digits(integer = 10, fraction = 0)
    @Positive
    @NotNull
    private Long phoneNum = null;

    public User() {}

    public User(Integer id, String name, String surname, String address, Long phoneNum) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

}
