package Abstract_Factory;

public class MacFactory extends GUIFactory{

  public IButton createButton() {
    return new MacButton();
  }

  public ICheckBox createCheckBox() {
    return new MacCheckBox();
  }
  
}
