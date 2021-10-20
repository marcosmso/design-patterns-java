package v2;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, and sausage", false, 2.99);
        addItem("Blueberry Pancake Breakfast", "Pancake with fresh blueberry", true, 3.49);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
