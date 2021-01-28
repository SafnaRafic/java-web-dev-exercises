package exercises.Inheritance.Technology.test;

import exercises.Inheritance.Technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer myComputer;

    @Before
    public void initTest(){
        myComputer = new Computer(3000,5000,"2021");

    }

    @Test
    public void constructorSetsValueTest(){

        assertEquals(3000,this.myComputer.getScreenWidth());
        assertEquals(5000,this.myComputer.getScreenHeight());
        assertEquals("2021",this.myComputer.getManufacturerYear());
    }

    @Test
    public void TwoPlusTwoReturnsFourTest(){
        assertEquals(4,myComputer.processTWoTwo());
    }
}
