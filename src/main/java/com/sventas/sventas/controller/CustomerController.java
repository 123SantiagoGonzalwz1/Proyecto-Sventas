package com.sventas.sventas.controller;

import com.sventas.sventas.exception.ModelNotFoundException;
import com.sventas.sventas.model.Customers;
import com.sventas.sventas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customers>> findAll() {
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<Customers> create(@RequestBody Customers customers) {
        return new ResponseEntity<>(customerService.create(customers), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Customers customers) {
        customerService.update(customers);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> findById(@PathVariable("id") Integer client_id) {
        Customers customers = customerService.findById(client_id);
        if(customers == null) {
            throw  new ModelNotFoundException("Cliente no encontrado.");
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer client_id) throws Exception {
        Customers customers = customerService.findById(client_id);
        if(customers == null) {
            throw  new ModelNotFoundException("El cliente que desea eliminar no existe.");
        }
        customerService.delete(client_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
