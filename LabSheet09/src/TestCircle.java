public class TestCircle {
	public static void main(String[] args) {
		// Test all constructors and toString()
		Circle c1 = new Circle(1.1, "blue");
		System.out.println(c1); // implicitly run toString()
		System.out.println();
		//Circle[radius=1.1, color=blue]
		
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		System.out.println();
		//Circle[radius=2.2, color=red]
		
		Circle c3 = new Circle();
		System.out.println(c3);
		System.out.println();
		//Circle[radius=1.0, color=red]
		// Test Setters and Getters
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("The radius of c1 is: "+c1.getRadius());
		System.out.println("The color of c1 is: "+c1.getColor());
		
		//Test getArea() and getCircumference()
		System.out.printf("The Area is: %.2f%n",c1.getArea() );
		System.out.printf("The circumference is : %.3f", c1.getCircumference());
 
 }
}