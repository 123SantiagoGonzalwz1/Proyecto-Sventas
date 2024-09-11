package com.sventas.sventas.controller;

import com.sventas.sventas.model.Customers;
import com.sventas.sventas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customers> findAll() {
        return customerService.findAll();
    }

    @PostMapping
    public  Customers create(@RequestBody Customers customers) {
        return customerService.create(customers);
    }

    @PutMapping
    public Customers update(@RequestBody Customers customers) {
        return customerService.update(customers);
    }

    @GetMapping("/{id}")
    public Customers findById(@PathVariable("id") Integer client_id) {
        return customerService.findById(client_id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer client_id) {
        customerService.delete(client_id);
    }
}
