package Composite;

import java.util.ArrayList;

public class CompoundGraphic implements IGraphic {

  ArrayList<IGraphic> children = new ArrayList<IGraphic>();
  
  public void addComponent(IGraphic child) {
    this.children.add(child);
  }

  public void move(int x, int y) {
    for (IGraphic child: this.children) {
      child.move(x, y);
    }
  }

  public void draw() {
    for (IGraphic child: this.children) {
      child.draw();
    }
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(1,1);
    Circle c2 = new Circle(4,3);

    CompoundGraphic compound = new CompoundGraphic();
    compound.addComponent(c1);
    compound.addComponent(c2);

    compound.draw();
    System.out.println("Moving components (dx=3, dy=-2):");
    compound.move(3,-2);
    compound.draw();
  }
  
}
