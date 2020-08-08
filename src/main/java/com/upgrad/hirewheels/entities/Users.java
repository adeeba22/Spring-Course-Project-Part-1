package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column( nullable = false)
    private String firstName;
    private String lastName;
    @Column( nullable = false, columnDefinition = "varchar2(50) check (length(password)>5)")
    private String password;
    @Column( nullable = false, unique = true)
    private String emailId;
    @Column( nullable = false, unique = true)
    private String mobileNo;
    @Column(nullable = false)
    private int roleId;
    @Column(columnDefinition = "number(10,2) default (10000.00)")
    private double walletMoney;

     @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    List<Booking> booking;

    public Users(){

    }

    public Users(String firstName, String lastName, String password, String emailId, String mobileNo, int roleId, double walletMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.roleId = roleId;
        this.walletMoney = walletMoney;
    }

    public Users(int userId, String firstName, String lastName, String password, String emailId, String mobileNo, double walletMoney) {
        this.userId=userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.walletMoney = walletMoney;
    }

    public Users(int userId, String firstName, String lastName, String password, String emailId, String mobileNo, int roleId, double walletMoney) {
        this.userId=userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.roleId=roleId;
        this.walletMoney = walletMoney;
    }

    public Users(int roleId) {
        this.roleId=roleId;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Users users = (Users) o;
//        return firstName.equals(users.firstName) &&
//                lastName.equals(users.lastName) &&
//                password.equals(users.password) &&
//                emailId.equals(users.emailId) &&
//                mobileNo.equals(users.mobileNo) &&
//                roleId.equals(users.roleId);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash()
//    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + userId +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + emailId + '\'' +
                ", mobileno='" + mobileNo + '\'' +
                ", roleId='" + roleId + '\'' +
                " walletmoney='" + walletMoney +
                '}';
    }
}
