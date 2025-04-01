package decisionorcondition;
//28-3-25
public class IfElse {
	public static void divisibleBy3And5(int a) {
	if(a%3==0 && a%5==0) {
		System.out.println("number is divisible by 3 and 5");
	}else {
		if(a%3==0) {
			System.out.println("number is divisible by 3");
		}else {
			if(a%5==0) {
				System.out.println("number is divisible by 5");
			}else {
				System.out.println("number is not divisible by 3 and 5");
			}
		}
	}
	}
		

	

	public static void main(String[] args) {
		int a=15;
		divisibleBy3And5(a);
		

	}

}
