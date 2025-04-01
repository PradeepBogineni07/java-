package operatorsjava;

public class LogicalOr {

	public static void main(String[] args) {
		
		//if any one value is true it gives true 
	/*	boolean ip1=true;
		boolean ip2=false;
		System.out.println(ip1||ip1);
		System.out.println(ip1||ip2);
		System.out.println(ip2||ip1);
		System.out.println(ip2||ip2);
		*/
		
		int a=30;
		int b=45;
		System.out.println(!(a<b)||(a>b));
		System.out.println(5<4 || 4>5);

	}

}
