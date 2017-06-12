package com.larry.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by hangyanjiang on 2017/6/12.
 */

public class Customer {

    private String firstName;

    @NotNull
    @Size(min=1, message = "is required")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
