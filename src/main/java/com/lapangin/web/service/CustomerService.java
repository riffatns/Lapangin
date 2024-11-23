package com.lapangin.web.service;

import com.bookinglapangan.model.Customer;
import com.bookinglapangan.model.Pesanan;
import com.bookinglapangan.repository.CustomerRepository;
import com.bookinglapangan.repository.PesananRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PesananRepository pesananRepository;

    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Pesanan> getCustomerBookings(int customerID) {
        return pesananRepository.findByCustomer_UserID(customerID);
    }
}
