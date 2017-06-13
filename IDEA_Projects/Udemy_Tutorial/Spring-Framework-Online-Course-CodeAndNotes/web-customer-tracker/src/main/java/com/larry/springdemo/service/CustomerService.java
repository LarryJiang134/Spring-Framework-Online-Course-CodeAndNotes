package com.larry.springdemo.service;

import com.larry.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
