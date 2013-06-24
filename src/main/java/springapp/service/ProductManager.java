/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import java.io.Serializable;
import java.util.List;
import springapp.domain.Product;

/**
 *
 * @author wjirawong
 */
public interface ProductManager extends Serializable{
    public void increasePrice(int percentage);
    public List<Product> getProducts();
}
