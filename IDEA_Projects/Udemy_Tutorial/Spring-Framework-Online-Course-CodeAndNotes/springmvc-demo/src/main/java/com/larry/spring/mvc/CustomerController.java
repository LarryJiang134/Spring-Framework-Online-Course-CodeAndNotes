package com.larry.spring.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by hangyanjiang on 2017/6/12.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // add aan initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for validation
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        // true: if all whitespaces trim to null
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @RequestMapping("showForm")
    public String showForm(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";

    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        System.out.println(">> last name: |" + theCustomer.getLastName() + "|");
        System.out.println(">> bing result: |" + theBindingResult + "|");
        System.out.println("\n\n\n");

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }

    }

}
