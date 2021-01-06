package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RestaurantClass {
    public static void  main(String[] args){
        ArrayList<MenuItem> menuItems=new ArrayList<>();
        Menu menu = new Menu();
        MenuItem menuItem=new MenuItem();
        MenuItem menuItem1=new MenuItem(1,"Tomato Soup", 3.99,"Soup made of tomato", "Appetizer",new Date());
        menuItems.add(menuItem1);
        MenuItem menuItem2=new MenuItem(2,"French Fries",2.99,"Made of potatoes","Appetizer",new Date());
        menuItems.add(menuItem2);
        menu.setMenuItems(menuItems);
        menu.addItem(new MenuItem(3,"Cheese Pizza",6.99, "Pizza with cheese medium Size","Entree",new Date()));
        System.out.println(menu);

        System.out.println("Enter menu that you want to delete");
        Scanner input=new Scanner(System.in);
        String deleteMenu=input.nextLine();
        for(MenuItem item:menuItems){
            if(item.getName().equals(deleteMenu)) {
                menu.deleteMenuItem(item);
            }
        }

        //menu.deleteMenuItem(menuItem1);
        System.out.println("Updated Menu \n"+menu);
        System.out.println("Enter a menu you want to look out: ");
        String menuName=input.nextLine();
        for(MenuItem item:menuItems){
            if(item.getName().equals(menuName)) {
                System.out.println(item);
            }
        }
    }
}
