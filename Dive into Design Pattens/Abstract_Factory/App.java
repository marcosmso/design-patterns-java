package Abstract_Factory;

public class App {
  public static void main(String[] args) {
    GUIFactory factory = new WinFactory();

    IButton button = factory.createButton();
    ICheckBox checkBox = factory.createCheckBox();

    System.out.println(button.render());
    System.out.println(checkBox.render());
    

  }
  
}
