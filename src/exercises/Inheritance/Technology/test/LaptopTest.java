package exercises.Inheritance.Technology.test;

import exercises.Inheritance.Technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;
    

    @Before
    public void initTest(){
        myLaptop = new Laptop(3000,5000,"2021",true);

    }

    @Test
    public void constructorSetsValueTest(){

        assertEquals(3000,this.myLaptop.getScreenWidth());
        assertEquals(5000,this.myLaptop.getScreenHeight());
        assertEquals("2021",this.myLaptop.getManufacturerYear());
        assertEquals(true,this.myLaptop.isIntellijOpened());
    }

    @Test
    public void openIntelliJSetsIsIntellijOpenedToTrue(){
        this.myLaptop.setIntellijOpened(false);
        assertEquals(false,this.myLaptop.isIntellijOpened());
        this.myLaptop.openIntellij();
        assertEquals(true,this.myLaptop.isIntellijOpened());
    }
}
