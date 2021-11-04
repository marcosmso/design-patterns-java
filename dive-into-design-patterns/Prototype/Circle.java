package Prototype;

public class Circle extends Shape {
  int radius;

  public Circle(int radius, String color){
    super(color);
    this.radius = radius;
  }

  public Shape clone(){
    return new Circle(radius, color);
  }

  public String render(){
    return String.format("Circle %s: %s %d", this.hashCode(), this.color, this.radius);
  }

}
