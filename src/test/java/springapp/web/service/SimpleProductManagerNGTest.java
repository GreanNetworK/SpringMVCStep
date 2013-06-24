/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web.service;

import springapp.service.SimpleProductManager;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import springapp.domain.Product;

/**
 *
 * @author wjirawong
 */
public class SimpleProductManagerNGTest {

    private SimpleProductManager simpleProductManager;
    private List<Product> products;
    private static int PRODUCT_COUNT = 2;
    private static String P1_DESC = "P1";
    private static Double P1_PRICE = 10.03D;
    private static String P2_DESC = "P2";
    private static Double P2_PRICE = 100.00D;
    private static int POSITIVE_INCREASE = 10;

    public SimpleProductManagerNGTest() {
    }

    @BeforeClass
    public void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        simpleProductManager = new SimpleProductManager();
        products = new ArrayList<Product>();

        Product product = new Product();
        product.setDescription(P1_DESC);
        product.setPrice(P1_PRICE);
        products.add(product);

        product = new Product();
        product.setDescription(P2_DESC);
        product.setPrice(P2_PRICE);
        products.add(product);

        simpleProductManager.setProducts(products);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testProductWithNoProducts() {
        System.out.println("ProductWithNoProducts");
        simpleProductManager = new SimpleProductManager();
        assertNull(simpleProductManager.getProducts());
    }

    /**
     * Test of getProducts method, of class SimpleProductManager.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        List<Product> testProducts = simpleProductManager.getProducts();
        assertNotNull(testProducts);
        assertEquals(PRODUCT_COUNT, simpleProductManager.getProducts().size());

        Product p1 = simpleProductManager.getProducts().get(0);
        assertEquals(P1_DESC, p1.getDescription());
        assertEquals(P1_PRICE, p1.getPrice());

        Product p2 = simpleProductManager.getProducts().get(1);
        assertEquals(P2_DESC, p2.getDescription());
        assertEquals(P2_PRICE, p2.getPrice());
    }

    /**
     * Test of increasePrice method, of class SimpleProductManager.
     */
    @Test
    public void testIncreasePriceWithNullListProducts() {
        System.out.println("IncreasePriceWithNullListProducts");
        simpleProductManager = new SimpleProductManager();
        try {
            simpleProductManager.increasePrice(POSITIVE_INCREASE);
        } catch (NullPointerException ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void testIncreasePriceWithEmptyListProducts() {
        System.out.println("IncreasePriceWithEmptyListProducts");
        simpleProductManager = new SimpleProductManager();
        simpleProductManager.setProducts(new ArrayList<Product>());

        try {
            simpleProductManager.increasePrice(POSITIVE_INCREASE);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void testIncreasePriceWithNegativePercentage() {
        System.out.println("IncreasePriceWithNegativePercentage");
        try {
            simpleProductManager.increasePrice(POSITIVE_INCREASE * -1);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void testIncreasePrice() {
        double expectedPrice = 200.00d;
        simpleProductManager.increasePrice(100);

        Product p = simpleProductManager.getProducts().get(1);
        assertEquals(expectedPrice, p.getPrice());
    }
}