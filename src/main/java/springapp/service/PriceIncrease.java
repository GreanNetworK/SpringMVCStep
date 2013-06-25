/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author wjirawong
 */
public class PriceIncrease {
    protected final Log log = LogFactory.getLog(getClass());
    
    private int percentage;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    
    
}
