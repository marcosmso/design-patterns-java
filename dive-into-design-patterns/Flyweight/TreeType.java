package Flyweight;
public class TreeType {
  String name;
  String color;
  String texture;

  TreeType(String name, String color, String texture){
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  void draw(int x, int y){
    System.out.println(String.format("Tree %s at (%d, %d)", this.name, x, y));
  }
}
