 class my{
	 
	 // Properties || Variables
	 
	int length;
	int breadth;
	
	 //Methods || computational work
	public int area() {
		return length*breadth;
		
	}
	public int parameter() {
		return 2*(length+breadth);
	}
}
public class rectangle {

	public static void main(String[] args) {

		my obj1=new my();
		
		obj1.length=10;
		obj1.breadth=10;
		System.out.println("Area: "+obj1.area());
		System.out.println("Parameter: "+obj1.parameter());
		

	}

}
