package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantClass {
    public static void  main(String[] args){
        ArrayList<MenuItem> menuItems=new ArrayList<>();
        Menu menu = new Menu();
        MenuItem menuItem1=new MenuItem(1,"Tomato Soup", 3.99,"Soup made of tomato", "Appetizer",new Date());
        menuItems.add(menuItem1);
        MenuItem menuItem2=new MenuItem(2,"French Fries",2.99,"Made of potatoes","Appetizer",new Date());
        menuItems.add(menuItem2);
        menu.setMenuItems(menuItems);
        System.out.println(menu);

    }
}
