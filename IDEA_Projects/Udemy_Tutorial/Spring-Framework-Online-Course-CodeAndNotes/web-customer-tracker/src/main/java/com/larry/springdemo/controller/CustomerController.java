package com.larry.springdemo.controller;

import com.larry.springdemo.dao.CustomerDAO;
import com.larry.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hangyanjiang on 2017/6/12.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // need to inject the customer dao
    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        // get customers from the dao
        List<Customer> theCustomers = customerDAO.getCustomers();

        // add the customers to the model
        theModel.addAttribute("customers", theCustomers);

        return "list-customers";

    }

}
