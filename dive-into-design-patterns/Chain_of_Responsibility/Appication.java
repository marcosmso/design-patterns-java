package Chain_of_Responsibility;

public class Appication {
  public static void main(String[] args) {
    Dialog dialog = new Dialog("http://dialoghelp.com");
    Panel panel = new Panel("This panel does...");
    Button button = new Button();
    button.toolTipText = "This button is an OK button that...";

    panel.add(button);
    dialog.add(panel);

    dialog.showHelp();

  }

}
