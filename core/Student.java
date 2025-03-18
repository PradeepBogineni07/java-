package core;

public class Student {      //own details using static variable
	static String Name="Pradeep";
	static int Age=24;
	static char Initial='B';
	static boolean Ispresent=false;
	static String CollegeName="Vignana Bharathi Engineering College";

	public static void main(String[] args) {
		System.out.println("Name :"+Name);
		System.out.println("Age :"+Age);
		System.out.println("Initial :"+Initial);
		System.out.println("Ispresent :"+Ispresent);
		System.out.println("CollegeName :"+CollegeName);
		
	/*	
		//using classname
		System.out.println("Name :"+Student.Name);
		System.out.println("Age :"+Student.Age);
		System.out.println("Initial :"+Student.Initial);
		System.out.println("Ispresent :"+Student.Ispresent);
		System.out.println("CollegeName :"+Student.CollegeName);*/
		
		

	}

}
