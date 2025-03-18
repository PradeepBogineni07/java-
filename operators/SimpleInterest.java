package operators;

public class SimpleInterest {
	static float P =100000;
	static float T=2;
	static float R=2;
	static float I;
	
	public static void main(String[] args) {
		
		I=(P*T*R)/100;
		System.out.println("The simple interest is :" +I);
	}

}
