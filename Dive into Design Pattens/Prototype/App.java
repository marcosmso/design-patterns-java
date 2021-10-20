package Prototype;

public class App {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(2,3, "red");
    Shape circle = new Circle(4, "blue");

    Shape copy_of_circle = circle.clone();
    Shape copy_of_rectangle = rectangle.clone();

    System.out.println(rectangle.render());
    System.out.println(copy_of_rectangle.render());

    System.out.println(circle.render());
    System.out.println(copy_of_circle.render());

  }
}
