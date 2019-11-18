package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date menuAddedDate;

    public MenuItem(String name, double price, String description, String category, Date menuAddedDate) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.menuAddedDate = menuAddedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getMenuAddedDate() {
        return menuAddedDate;
    }

    public void setMenuAddedDate(Date menuAddedDate) {
        this.menuAddedDate = menuAddedDate;
    }
}
