package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem>menu;
    private LocalDate version;
    private static MenuItem mostRecent;



    public Menu() {
        this.menu = new ArrayList<>();
        this.version = LocalDate.now();
    }

    public void addMenuItems(MenuItem item){
        for(MenuItem itemToTest:menu){
            if(itemToTest.equals(item)) {
                System.out.println("Unable to add " + item.getName() + " because it is already there!");
                return;
            }}
                menu.add(item);
                mostRecent = item;
                version = LocalDate.now();
                System.out.println(item.getName()+" added successfully!");
    }

    public void removeMenuItems(MenuItem item){
        if(menu.contains(item)) {
            menu.remove(item);
            System.out.println(item.getName()+" removed successfully!");
        }else{
            System.out.println("Cannot remove "+item.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder toReturn=new StringBuilder();
        for(int i=0; i<menu.size(); i++){
            toReturn.append(i+1+" "+menu.get(i).getName()+" $"+menu.get(i).getPrice()+"0\n");
        }
        return toReturn.toString();
    }

    public void print(){
        System.out.println("Check out our new menu item "+mostRecent.getName()+"\n"+this);
    }

    public LocalDate lastUpdated(){
        System.out.println(version);
        return version;
    }

}
