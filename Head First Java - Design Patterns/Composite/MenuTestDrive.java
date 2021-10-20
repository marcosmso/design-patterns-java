
public class MenuTestDrive {

    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancake with fried eggs, and sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake Breakfast", "Pancake with fresh blueberry", true, 3.49));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "Lettuce ans rice with tomato", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon, Lettuce ans rice with tomato", false, 2.99));
        dinerMenu.add(new MenuItem("Rice and Beans", "Rice, beans and vegetables", true, 3.99));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Delicious Apple Pie", true, 1.59));

        cafeMenu.add(new MenuItem("Veggie Burger", "Delicious Plant Based Burger", true, 3.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
