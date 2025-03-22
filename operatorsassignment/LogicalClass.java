package operatorsassignment;

public class LogicalClass {
	public static void logicalAND() {
        int a = 16;
        int b = 15;
        
       	System.out.println("(" + a + " < 16) && (" + b + " > 15) = " + ((a < 15) && (b > 15)));
    }

    public static void logicalOR() {
        int a = 100;
        int b = 50;
        System.out.println("(" + a + " < 100) || (" + b + " > 50) = " + ((a < 100) && (b > 50)));
    }

    public static void logicalNOT() {
        int a = 100;
        int b = 150;
  
        System.out.println("(" + a + " < 100) && (" + b + " > 150) = " + ((a < 100) && (b > 150)));
    }
    public static void main(String[] args) {
        // Printing directly
    	LogicalClass.logicalAND();
    	LogicalClass.logicalOR();
    	LogicalClass.logicalNOT();
    }}      

  
 







