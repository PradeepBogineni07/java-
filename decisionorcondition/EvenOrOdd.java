package decisionorcondition;

public class EvenOrOdd {
	public static void evenOrOdd(int a) {
		if (a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) {
		evenOrOdd(44);
		evenOrOdd(56);

	}

}
