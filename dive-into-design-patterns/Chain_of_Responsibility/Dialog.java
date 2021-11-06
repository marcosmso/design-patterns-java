package Chain_of_Responsibility;

public class Dialog extends Container {
  String wikiPageURL;
  
  Dialog(String url){
    this.wikiPageURL = url;
  } 

  public void showHelp(){
    if (wikiPageURL != null){
      System.out.print(wikiPageURL);
    } else {
      super.showHelp();
    }
  }
}
