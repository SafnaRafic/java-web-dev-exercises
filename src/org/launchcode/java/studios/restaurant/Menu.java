package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }
    public void deleteMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return getMenuItems().equals(menu.getMenuItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMenuItems());
    }
}
