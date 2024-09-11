package com.sventas.sventas.service;

import com.sventas.sventas.model.Customers;

import java.util.List;

public interface ICustomerService {

    Customers create(Customers customers);
    Customers update(Customers customers);
    Customers findById(Integer id);
    List<Customers> findAll();
    void delete(Integer id);
}
