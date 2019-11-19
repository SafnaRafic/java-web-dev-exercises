package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String category;
    private Date menuAddedDate;

    public MenuItem(Integer id,String name, double price, String description, String category, Date menuAddedDate) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.menuAddedDate = menuAddedDate;
    }

    public MenuItem(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", menuAddedDate=" + menuAddedDate +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                getId().equals(menuItem.getId()) &&
                getName().equals(menuItem.getName()) &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory()) &&
                getMenuAddedDate().equals(menuItem.getMenuAddedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getDescription(), getCategory(), getMenuAddedDate());
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
