package operators;

public class AreaOfRectangle {
	static int Length=25;
	static int Breadth=180;
	static int Area;
	static int Perimeter;

	public static void main(String[] args) {
		Area=(Length*Breadth);
		Perimeter=2*(Length + Breadth);
		
		System.out.println("The area of rectangle:"+Area);
		System.out.println("The Perimeter of rectangle:"+Perimeter);
		

	}

}
