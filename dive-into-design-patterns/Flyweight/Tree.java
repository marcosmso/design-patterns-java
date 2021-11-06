package Flyweight;
public class Tree {
  int x;
  int y;
  TreeType type;

  Tree(int x, int y, TreeType type) {
    this.x = x; 
    this.y = y; 
    this.type = type;
  }

  void draw(){
    this.type.draw(this.x, this.y);
  }

}
