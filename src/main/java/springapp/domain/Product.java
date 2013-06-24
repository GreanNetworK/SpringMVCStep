/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.domain;

import java.io.Serializable;

/**
 *
 * @author wjirawong
 */
public class Product implements Serializable {

    private String description;
    private Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", price=" + price + '}';
    }
    
    
}
