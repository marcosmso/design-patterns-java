package Chain_of_Responsibility;

public class Component implements ComponentWithContextualHelp{

  String toolTipText = null;

  Component container;

  public void showHelp() {
    if (toolTipText != null){
      System.out.print(toolTipText);
    }
    container.showHelp();
  }
  
}
