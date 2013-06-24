/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import springapp.service.ProductManager;

/**
 *
 * @author wjirawong
 */
public class InventoryController implements Controller{
    
    protected final Log log = LogFactory.getLog(getClass());
    
    private ProductManager productManager;

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        String now = new Date().toString();
        log.info("returnning hello view with "+now);
        
        Map<String,Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", productManager.getProducts());
        
        return new ModelAndView("hello", "model", myModel);
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }
    
    
    
}
