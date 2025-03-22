package operatorsassignment;

public class ArithmeticOperator {
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
        // Printing directly
        addition();
        subtraction();
        multiplication();
        division();
        modulus();
       
        // printing using Object Reference Variable
        ArithmeticOperator obj = new ArithmeticOperator();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.modulus();
    }}      

  
      
