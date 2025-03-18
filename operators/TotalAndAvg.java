package operators;

public class TotalAndAvg {
	static float Subject1=76;
	static float Subject2=86;
	static float Subject3=96;
	static float Subject4=76;
	static float Subject5=66;
	static float Subject6=88;
	static float Total;
	static double Avg;
	public static void main(String[] args) {
		Total=(Subject1+Subject2+Subject3+Subject4+Subject5+Subject6);
		Avg=Total/6;
		
		System.out.println("Total Marks:"+Total);
		System.out.println("Average Marks Obtained By Student:"+Avg);		

	}
}
