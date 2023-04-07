package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;



    private LocalDate dateAdded;

    private int id =0;
    private static int classID =0;
//    private boolean isNew;
//    private boolean isAvailable;
//    private boolean isVegan;
//    private boolean isVegetarian;
//    private ArrayList<String> allergens;
//    private int spiceLevel;


    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.id=classID;
        classID++;
    }

    @Override
    public String toString() {
        return  name + "\n"+
                "$" +price +"0\n"+
                description +"\n"+
                "Category = " + category +"\n"+
                "Date Added = " + dateAdded +"\n";
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void print(){
        System.out.println(this);
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}