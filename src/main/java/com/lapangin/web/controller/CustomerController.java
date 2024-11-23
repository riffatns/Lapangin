package com.lapangin.web.controller;

import com.lapangin.web.model.Customer;
import com.lapangin.web.model.Pesanan;
import com.lapangin.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return customerService.registerCustomer(customer);
    }

    @GetMapping("/{customerID}/bookings")
    public List<Pesanan> getBookings(@PathVariable int customerID) {
        return customerService.getCustomerBookings(customerID);
    }
}
