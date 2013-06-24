/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
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
public class HelloControllerNGTest {

    public HelloControllerNGTest() {
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
     * Test of handleRequest method, of class HelloController.
     */
    @Test
    public void testHandleRequestView() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest hsr = null;
        HttpServletResponse hsr1 = null;
        HelloController instance = new HelloController();

        String expViewName = "hello";
        ModelAndView result = instance.handleRequest(hsr, hsr1);
        assertEquals(result.getViewName(), expViewName);
    }

    @Test
    public void testViewAndModelGetNowIsNotNull() throws Exception {
        System.out.println("handleRequest::getNow");
        HttpServletRequest hsr = null;
        HttpServletResponse hsr1 = null;
        HelloController instance = new HelloController();
        
        ModelAndView result = instance.handleRequest(hsr, hsr1);
        String get = (String) result.getModel().get("now");
        assertNotNull(get);
    }
}