package com.larry.springdemo.dao;

import com.larry.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomers(int theId);

    public void deleteCustomer(int theId);
}
