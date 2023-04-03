package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem>menu;
    private Date version;
    private MenuItem mostRecent;

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public MenuItem getMostRecent() {
        return mostRecent;
    }

    public void setMostRecent(MenuItem mostRecent) {
        this.mostRecent = mostRecent;
    }

    public static void main(String[] args) {

    }

}
