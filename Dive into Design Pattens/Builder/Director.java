package Builder;

public class Director {
  private IBuilder builder;

  void setBuilder(IBuilder builder){
    this.builder = builder;
  }

  void constructSportsCar(){
    builder.reset();
    builder.setSeats(2);
    builder.setEngine("Sport Engine");
    builder.setTripComputer("Mac-car");
    builder.setGPS("Garmin 10.0");
  }

  void constructSUVCar(){
    builder.reset();
    builder.setSeats(5);
    builder.setEngine("SUV");
    builder.setTripComputer("Win-car");
    builder.setGPS("Garmin 9.0");
  }
  
}
