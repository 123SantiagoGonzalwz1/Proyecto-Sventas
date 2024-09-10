package com.sventas.sventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer client_id;

    @Column(name = "name", nullable = false, length = 70)
    private String name;

    @Column(name = "lastname", nullable = false, length = 150)
    private String lastname;

    @Column(name = "address", nullable = true, length = 150)
    private String address;

    @Column(name = "phone", nullable = true, length = 10)
    private String phone;

    @Column(name = "email", nullable = true, length = 55)
    private String email;

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
