package Decorator;
public class FileDataSource implements DataSource {

  String path;

  public FileDataSource(String path){
    this.path = path;
  }

  public void writeData(){
    System.out.println("Writing data...");
  }

  public void readData(){
    System.out.println("Reading data from " + this.path );
  }

  public static void main(String[] args){
    DataSource source = new EncryptionDecorator(new EncryptionDecorator(new FileDataSource("somefile.dat")));
    source.writeData();
  }
}
