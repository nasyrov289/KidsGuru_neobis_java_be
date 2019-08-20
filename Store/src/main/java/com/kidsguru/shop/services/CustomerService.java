package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CustomerEntity;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerById(int customerId) {
        return new Customer(customerRepository.findById(customerId).orElseThrow(RuntimeException::new));
    }

    public List<Customer> getAllCustomer() {
        ArrayList<Customer> customerList = new ArrayList<>();
        for (int i = 0; i < customerRepository.findAll().size(); i++) {
            customerList.add(new Customer(customerRepository.findAll().get(i)));
        }
        return customerList;
    }

    public Customer saveCustomer(Customer customer) {
        CustomerEntity saveResult = customerRepository.save(customer.convertToEntity());
        return new Customer(saveResult);
    }

    public void deleteCustomerById(int customerId) {
        customerRepository.deleteById(customerId);
    }
}
