package v1;
import java.util.ArrayList;

public class PancakeHouseMenu {
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

    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}
