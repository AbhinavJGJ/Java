import java.util.*;

public class circle {
	public double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double parameter() {
		return 2 * Math.PI * radius;
	}

	public double circumfrence() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {

		circle c1 = new circle();
		circle c2 = new circle();
		c1.radius = 7;
		c2.radius = 14;

		System.out.println("Area " + c1.area());
		;
		System.out.println("Parameter " + c1.parameter());
		System.out.println("Circumfrence " + c1.circumfrence());
		System.out.println(" ");
		System.out.println("Area " + c2.area());
		;
		System.out.println("Parameter " + c2.parameter());
		System.out.println("Circumfrence " + c2.circumfrence());

	}

}
