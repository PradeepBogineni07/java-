package operatorsassignment;

public class AssignmentOperator {
	public static void assignValues() {
		int a = 15;
		System.out.println("a = " + a);
		}

		public static void addAssign() {
		int a = 15;
		a += 5;
		System.out.println("a += 5 → " + a);
		}

		public static void subtractAssign() {
		int a = 15;
		a -= 5;
		System.out.println("a -= 5 → " + a);
		}

		public static void multiplyAssign() {
		int a = 10;
		a *= 15;
		System.out.println("a *= 5 → " + a);
		}

		public static void divideAssign() {
		int a = 10;
		a /= 15;
		System.out.println("a /= 5 → " + a);
		}

		public static void modulusAssign() {
		int a = 10;
		a %= 3;

		System.out.println("a %= 3 → " + a);
		
		}
		public static void main(String[] args) {
		// Printing directly
		assignValues();
		addAssign();
		subtractAssign();
		multiplyAssign();
		divideAssign();
		modulusAssign();
		}}

		


