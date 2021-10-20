package v1;
import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
    ArrayList <MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return position < menuItems.size();
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
