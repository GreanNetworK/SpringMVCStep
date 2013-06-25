/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author wjirawong
 */
public class PriceIncreaseValidator implements Validator {

    private final int DEFAULT_MIN_PERCENTAGE = 0;
    private final int DEFAULT_MAX_PERCENTAGE = 50;
    private int minPercentage = DEFAULT_MIN_PERCENTAGE;
    private int maxPercentage = DEFAULT_MAX_PERCENTAGE;

    @Override
    public boolean supports(Class<?> clazz) {
        return PriceIncrease.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PriceIncrease pi = (PriceIncrease) target;
        if (pi == null) {
            errors.rejectValue("percentage", "error.not-sprcified", null, "value required");
        } else {
            if (pi.getPercentage() > maxPercentage) {
                errors.rejectValue("percentage", "error.too-high",new Object[]{new Integer(maxPercentage)}, "Value too high.");
            }
            if(pi.getPercentage() <= minPercentage){
                errors.rejectValue("percentage", "error.too-low",new Object[] {new Integer(minPercentage)}, "Value too low.");
            }
        }
    }

    public int getMinPercentage() {
        return minPercentage;
    }

    public void setMinPercentage(int minPercentage) {
        this.minPercentage = minPercentage;
    }

    public int getMaxPercentage() {
        return maxPercentage;
    }

    public void setMaxPercentage(int maxPercentage) {
        this.maxPercentage = maxPercentage;
    }
}
