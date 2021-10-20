package Prototype;

public class Rectangle extends Shape {
  int height;
  int width;

  Rectangle(int width, int height, String color) {
    super(color);
    this.height = height;
    this.width = width;
  }

  public Shape clone(){
    return new Rectangle(width, height, color);
  }

  public String render(){
    return String.format("Rectangle %s: %s %d %d", this.hashCode(), this.color, this.height, this.width);
  }

}
