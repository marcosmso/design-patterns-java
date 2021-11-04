public class DataSourceDecorator implements DataSource{
  protected DataSource wrappee;

  DataSourceDecorator(DataSource source){
    this.wrappee = source;
  }

  public void writeData() {
    wrappee.writeData();
  }

  public void readData() {
    wrappee.writeData();
  } 
}
