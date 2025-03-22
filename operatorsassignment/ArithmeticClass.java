package operatorsassignment;

public class ArithmeticClass {
	public static void addition() {
        int a = 100;
        int b = 50;
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static void subtraction() {
        int a = 100;
        int b = 50;
        int c = a - b;
        System.out.println(a + " - " + b + " = " + c);
    }

    public static void multiplication() {
        int a = 100;
        int b = 50;
        int c = a * b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public static void division() {
        int a = 100;
        int b = 50;
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);
    }

    public static void modulus() {
        int a = 100;
        int b = 50;
        int c = a % b;
        System.out.println(a + " % " + b + " = " + c);
    }


    public static void main(String[] args) {
       
        // Printing using class name
        ArithmeticOperator.addition();
        ArithmeticOperator.subtraction();
        ArithmeticOperator.multiplication();
        ArithmeticOperator.division();
        ArithmeticOperator.modulus();
        
    }}

    





