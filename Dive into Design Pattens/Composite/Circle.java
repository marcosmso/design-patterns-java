package Composite;

public class Circle implements IGraphic {

  int x;
  int y;

  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  public void draw() {
    System.out.println(String.format("Circle: (%d, %d)", this.x, this.y));
  }
  
}
