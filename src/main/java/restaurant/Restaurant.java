package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu myMenu=new Menu();
        MenuItem fries= new MenuItem("Fries", 5, "tasty potatoes", "Appetizer");
        MenuItem pasta= new MenuItem("Pasta", 6, "tasty starch", "Main");
        MenuItem cremeBrulee= new MenuItem("Creme Brulee", 4, "tasty sugar", "Dessert");
        MenuItem burger= new MenuItem("Burger", 10, "tasty beef", "Main");
        myMenu.addMenuItems(fries);
        myMenu.addMenuItems(pasta);
        myMenu.addMenuItems(cremeBrulee);
        myMenu.addMenuItems(burger);
        myMenu.addMenuItems(fries);

        myMenu.print();

        fries.print();

        myMenu.removeMenuItems(fries);
        myMenu.print();
        myMenu.lastUpdated();
        myMenu.addMenuItems(fries);
        myMenu.print();
    }
}
