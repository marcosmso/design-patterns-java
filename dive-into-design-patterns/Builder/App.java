package Builder;

public class App {
  public static void main(String [] args) {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();

    director.setBuilder(builder);
    director.constructSportsCar();
    Car sportCar = builder.getProduct();
    
    director.constructSUVCar();
    Car SUVCar = builder.getProduct();

    System.out.println(sportCar.print_specifications());
    System.out.println(SUVCar.print_specifications());
  
  }
}
