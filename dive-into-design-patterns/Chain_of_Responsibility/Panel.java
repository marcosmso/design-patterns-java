package Chain_of_Responsibility;

public class Panel extends Container {
  String modalHelpText;

  Panel(String modalHelpText){
    this.modalHelpText = modalHelpText;
  }

  public void showHelp(){
    if (modalHelpText != null){
      System.out.println(modalHelpText);
    } else{
      super.showHelp();
    }
  }
}
