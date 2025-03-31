package operatorsjava;

public class RelationalOprUsingString {

	public static void main(String[] args) {
		String s1="vignesh";
		String s2="vignesh"; //it stores in string constant pool
		String s3="vinay";
		
		String s4=new String("hii"); //it stores in heap area
		String s5=new String("hii");
			
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s2);
		System.out.println(s4==s5);	
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}
}
