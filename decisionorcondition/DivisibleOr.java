package decisionorcondition;
//using OR Operator 28-3-25
public class DivisibleOr {
		public static void divisibleBy3And5(int a) {
			if(a%3==0 || a%5==0) {
				System.out.println(" Num is Divisible by both 3 and 5");
			}
			else {
				System.out.println(" Num is Not Divisible by both 3 and 5");
			}
		}

		public static void main(String[] args) {
			int a=25;
			divisibleBy3And5(a);
			

		}

	}

	
