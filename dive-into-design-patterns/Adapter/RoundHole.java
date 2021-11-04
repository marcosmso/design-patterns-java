package Adapter;

public class RoundHole {
	
	double radius;

	RoundHole(double radius){
		this.radius = radius;
	}

	boolean fits(IRoundPeg roundPeg){
		System.out.println("My radius:" + this.radius);
		System.out.println("Peg radius:" + roundPeg.getRadius());
		return this.radius >= roundPeg.getRadius();
	}

	public static void main (String[] args) {
		RoundHole radius_5_role = new RoundHole(5);
		SquarePeg square = new SquarePeg(7);
		SquarePegAdapter adapted_square = new SquarePegAdapter(square);

		radius_5_role.fits(adapted_square);

	}
}
