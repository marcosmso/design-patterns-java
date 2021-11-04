package Prototype;

public abstract class Shape {
  
  String color;

  Shape(String color){ 
    this.color = color;
  }

  public abstract Shape clone();

  public abstract String render();

}
