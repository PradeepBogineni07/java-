package decisionorcondition;
//WITH RETURN TYPE
public class Voting {
	public static String eligibleOrNot(int a) {
		if(a>18) {
			return "eligible to vote";
		}
		else {
			return "not eligible to vote";
		}
	}

	public static void main(String[] args) {
		int age=15;
		String result=eligibleOrNot(age);
		System.out.println(result);

	}

}
