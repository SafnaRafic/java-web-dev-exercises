//package org.launchcode.java.demos.lsn6inheritance;
//
//import org.junit.Test;
//
//import static junit.framework.TestCase.*;
//import static org.junit.Assert.assertFalse;
//
//public class CatTest {
//    @Test
//    public void inheritsSuperInFirstConstructor() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
//        assertEquals(7, keyboardCat.getWeight(), .001);
//    }
//    @Test
//    public void inheritsDefaultCatInSecondConstructor() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
//        assertEquals(13, keyboardCat.getWeight(), .001);
//        assertNotNull(keyboardCat.getWeight());
//
//    }
//    @Test
//    public void isNotInitiallyTired() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
//        assertFalse(keyboardCat.isHungry());
//        assertFalse(keyboardCat.isTired());
//        keyboardCat.eat();
//        assertTrue(keyboardCat.isTired());
//
//    }
//}
