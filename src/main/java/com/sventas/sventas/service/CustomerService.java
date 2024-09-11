package com.sventas.sventas.service;

import com.sventas.sventas.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerService customerRepo;

    @Override
    public Customers create(Customers customers) {
        return customerRepo.save(customers);
    }

    @Override
    public Customers update(Customers customers) {
        return customerRepo.save(customers);
    }

    @Override
    public Customers findById(Integer id) {
        Optional<Customers> customersOptional = Optional.ofNullable(customerRepo.findById(id));
        return customersOptional.orElse(null);
    }

    @Override
    public List<Customers> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        customerRepo.deleteById(id);
    }
}
