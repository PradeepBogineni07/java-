package operatorsassignment;

public class AssignmentClass {    // using ClassName
	public static void assignValues() {
		int a = 15;
		System.out.println("a = " + a);
		}

		public static void addAssign() {
		int a = 115;
		a += 5;
		System.out.println("a += 5 → " + a);
		}

		public static void subtractAssign() {
		int a = 155;
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
			AssignmentClass.assignValues();
			AssignmentClass.addAssign();
			AssignmentClass.subtractAssign();
			AssignmentClass.multiplyAssign();
			AssignmentClass.divideAssign();
			AssignmentClass.modulusAssign();
			
		
			// Printing using object reference variable
			AssignmentClass obj = new AssignmentClass();
			obj.assignValues();
			obj.addAssign();
			obj.subtractAssign();
			obj.multiplyAssign();
			obj.divideAssign();
			obj.modulusAssign();
			}
			
		}

		





