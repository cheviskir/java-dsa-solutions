abstract class Figure{
	float base, float height;
	
	Figure(float base, float height) {
		base = a;
		height = b;
	}

	abstract float area();
}

class Rectangle extends Figure{
	Rectangle(float a, float b){
		super(a,b);
	}

	float area(){
		System.out.println("Area of a rectangle is: ");
		return a * b;
	}
}

class Triangle extends Figure{
	Triangle(float a, b){
		super(a, b);
	}

	float area(){
		System.out.println("Area of a trinagle is: ");
		return 1/2 * a * b;
	}
}

class FindAreea{
	public static void main(String[] args) {
		
	}
}