package core;
public class DataTypes { //Non-static Using ObjReferenceVariable
	 String s="Variables";
	 byte b1=22;
     short s1=11123;
	 int i1=2233432;
	 long l1;
	 float f1;
	 double d1;
	 char ch;
	 boolean bool;

	public static void main(String[] args) {
		
		DataTypes obj=new DataTypes();	
		
		System.out.println(obj.s);
		System.out.println(obj.b1);
		System.out.println(obj.s1);
		System.out.println(obj.i1);
		System.out.println(obj.l1);
		System.out.println(obj.f1);
		System.out.println(obj.d1);
		System.out.println(obj.ch);
		System.out.println(obj.bool);
}}
