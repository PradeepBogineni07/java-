package decisionorcondition;
//WITHOUT RETURN TYPE 28-3-25
public class Division {
	public static void divisibleBy5OrNot(int a) {
		if(a%5==0) {
			System.out.println("number is divisible by 5");
		}
		else {
			System.out.println("number is not divisible by 5");
		}
	}

	public static void main(String[] args) {
		int age=25;
		divisibleBy5OrNot(age);
		
		

	}

}
