package Factory;

public class Dialog {
	public void render(){
		IButton okButton = createButton();
		okButton.onClick();
		okButton.render();
	}

	public IButton createButton() {
		return null;
	}

}
