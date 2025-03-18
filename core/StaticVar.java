package core;

public class StaticVar{
	static int a;
	public static void main(String[] args) {
		StaticVar obj1=new StaticVar();
		StaticVar obj2=new StaticVar();
		System.out.println("by using orv : "+obj1.a);
		System.out.println("by using orv : "+obj2.a);
		StaticVar.a=1000;
		StaticVar.a=10;
		System.out.println("by using orv : "+obj1.a);
		System.out.println("by using orv : "+obj2.a);
	    StaticVar obj3=new StaticVar();
		System.out.println(obj3.a);		
	}

}
