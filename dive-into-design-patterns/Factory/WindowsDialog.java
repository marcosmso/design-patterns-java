package Factory;

public class WindowsDialog extends Dialog {
    public IButton createButton(){
        return new WindowsButton();
    }
}
