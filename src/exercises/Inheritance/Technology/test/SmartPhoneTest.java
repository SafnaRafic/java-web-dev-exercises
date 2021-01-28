package exercises.Inheritance.Technology.test;

import exercises.Inheritance.Technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone mySmartPhone;

    @Before
    public void initTest(){
        mySmartPhone = new SmartPhone(3000,5000,"2021",true);

    }

    @Test
    public void constructorSetsValueTest(){

        assertEquals(3000,this.mySmartPhone.getScreenWidth());
        assertEquals(5000,this.mySmartPhone.getScreenHeight());
        assertEquals("2021",this.mySmartPhone.getManufacturerYear());
        assertEquals(true,this.mySmartPhone.getIsConnectedTo5G());
    }

}

