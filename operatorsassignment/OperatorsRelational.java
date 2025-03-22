package operatorsassignment;

public class OperatorsRelational { //directly accessing
	public static void lessthan() {
        int a = 6;
        int b = 5;
        boolean c = a < b;
        System.out.println(a + " < " + b + " = " + c);
    }

    public static void greaterthan() {
        int a = 100;
        int b = 50;
        boolean c = a > b;
        System.out.println(a + " > " + b + " = " + c);
    }

    public static void lessthanorequalto() {
        int a = 100;
        int b = 50;
        boolean c = a <= b;
        System.out.println(a + " <= " + b + " = " + c);
    }

    public static void greaterthanorequalto() {
        int a = 100;
        int b = 50;
        boolean c = a >= b;
        System.out.println(a + " >= " + b + " = " + c);
    }

    public static void equalsto() {
        int a = 100;
        int b = 50;
        boolean c = a == b;
        System.out.println(a + " == " + b + " = " + c);
    }


    public static void main(String[] args) {
        // Printing directly
        lessthan();
        greaterthan();
        lessthanorequalto();
        greaterthanorequalto();
        equalsto();
        
        // Using Object Reference Variables
        OperatorsRelational obj = new OperatorsRelational();
        obj.lessthan();
        obj.greaterthan();
        obj.lessthanorequalto();
        obj.greaterthanorequalto();
        obj.equalsto();
      
    }}      

  
 



