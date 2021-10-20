package v1;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT", "Lettuce ans rice with tomato", true, 2.99);
        addItem("BLT", "Bacon, Lettuce ans rice with tomato", false, 2.99);
        addItem("Rice and Beans", "Rice, beans and vegetables", true, 3.99);

    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        if( numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full!");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    // other methods

}
