/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.mycompany.myend2end.Car;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ShraddhaGanesh
 */
public class CarTest {
    Car carinfo;
    public CarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        carinfo = new Car();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    
@Test
public void ValidateCarcolor()
{
carinfo.setModel("sedan");
carinfo.setMake("Chrysler");
carinfo.setPrice(22000);
carinfo.setColor("Black");

    assertEquals("sedan", carinfo.getModel());
    assertEquals("Chrysler", carinfo.getMake());
    assertEquals(22000.0, carinfo.getPrice());
    assertEquals("Black", carinfo.getColor());

}


}
