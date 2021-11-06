package Decorator;

public class EncryptionDecorator extends DataSourceDecorator {

  EncryptionDecorator(DataSource source) {
    super(source);
  }

  public void writeData(){
    System.out.println("ENCRYPT data before writing...");
    super.writeData();
  }

  public void readData(){
    super.readData();
    System.out.println("DECRYPT data after reading...");
  }
  
}
