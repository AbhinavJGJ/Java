class cylinder_byte {

	// Properties ||
	double radius;
	double height;

	public double lidArea() {
		return Math.PI * radius * radius;
	}

	public double totalSurfaceArea() {
		return (2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
	}

	public double volume() {
		return (2 * Math.PI * radius * height);
	}

}

public class cylinder {

	public static void main(String[] args) {

		// Creating an Object

		cylinder_byte obj1 = new cylinder_byte();

		obj1.radius = 10;
		obj1.height = 20;

		System.out.println("Area : "+obj1.lidArea());
		System.out.println("totalSurfaceArea : "+obj1.totalSurfaceArea());
		System.out.println("volume : "+obj1.volume());

	}

}
