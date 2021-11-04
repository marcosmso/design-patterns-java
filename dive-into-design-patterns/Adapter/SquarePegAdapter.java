package Adapter;

public class SquarePegAdapter implements IRoundPeg {
    
    SquarePeg squarePeg;

    SquarePegAdapter(SquarePeg squarePeg) {
      this.squarePeg = squarePeg;
    }

    public double getRadius() {
        double width = squarePeg.getWidth();
        return width * Math.sqrt(2) / 2;
    }

}
