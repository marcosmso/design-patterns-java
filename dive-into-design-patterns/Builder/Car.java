package Builder;

public class Car {
  String engine;
  int qtt_seats;
  String gps_model;
  String trip_computer;

  public String print_specifications(){
    return String.format("Engine: %s, Seats: %d, GPS: %s, Trip computer: %s", engine, qtt_seats, gps_model, trip_computer); 
  }
}
