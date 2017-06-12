package com.larry.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by hangyanjiang on 2017/6/12.
 */

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode,
                           ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }
        return result;
    }

}
