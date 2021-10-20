package Factory;

public class WebDialog extends Dialog {
    public IButton createButton(){
        return new HTMLButton();
    }
}
