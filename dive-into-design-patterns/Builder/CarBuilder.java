package Builder;

public class CarBuilder implements IBuilder {

  Car car_in_production;

  public void reset() {
    car_in_production = new Car();
  }

  public void setSeats(int seats) {
    car_in_production.qtt_seats = seats;
  }

  public void setEngine(String engine) {
    car_in_production.engine = engine;
  }

  public void setTripComputer(String computer) {
    car_in_production.trip_computer = computer;
  }

  public void setGPS(String gps) {
    car_in_production.gps_model = gps;
  }

  public Car getProduct() {
    Car product = car_in_production;
    car_in_production = new Car();
    return product;
  }
  
}
