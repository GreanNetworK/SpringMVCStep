/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web.domain;

import springapp.domain.Product;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author wjirawong
 */
public class ProductNGTest {
    
    private Product instance;

    public ProductNGTest() {
    }

    @BeforeClass
    public void setUpClass() throws Exception {
         instance = new Product();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        instance.setPrice(100d);
        instance.setDescription("description");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");      
        String expResult = "description";
        String result = instance.getDescription();
        assertEquals(result, expResult);
    }

    /**
     * Test of setDescription method, of class Product.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        instance.setDescription(description);
        assertEquals(instance.getDescription(),"" );
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Double expResult = 100d;
        Double result = instance.getPrice();
        assertEquals(result, expResult);
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double price = null;
        instance.setPrice(price);
        assertNull(instance.getPrice());
    }
}