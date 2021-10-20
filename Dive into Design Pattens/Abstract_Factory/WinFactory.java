package Abstract_Factory;

public class WinFactory extends GUIFactory {

  public IButton createButton() {
    return new WinButton();
  }

  public ICheckBox createCheckBox() {
    return new WinCheckBox();
  }
  
}
