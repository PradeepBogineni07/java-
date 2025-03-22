package operatorsassignment;

public class RelationalClass {
		public static void lessthan() {
	        int a = 60;
	        int b = 50;
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
	    	RelationalClass.lessthan();
	    	RelationalClass.greaterthan();
	    	RelationalClass.lessthanorequalto();
	    	RelationalClass.greaterthanorequalto();
	    	RelationalClass.equalsto();
	    }}      

	  
	 






