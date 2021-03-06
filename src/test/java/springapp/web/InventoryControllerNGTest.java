/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import springapp.service.SimpleProductManager;

/**
 *
 * @author wjirawong
 */
public class InventoryControllerNGTest {
    
    public InventoryControllerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of handleRequest method, of class InventoryController.
     */
    @Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest hsr = null;
        HttpServletResponse hsr1 = null;
        InventoryController instance = new InventoryController();
        instance.setProductManager(new SimpleProductManager());
        
        ModelAndView result = instance.handleRequest(hsr, hsr1);
        assertEquals(result.getViewName(), "hello");
        assertNotNull(result.getModel());
        Map<String,Object> map = (Map<String,Object>) result.getModel().get("model");
        assertNotNull(map.get("now"));
    }
}