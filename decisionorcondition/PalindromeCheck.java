package decisionorcondition;

public class PalindromeCheck {
	    public static void main(String[] args) {
	        int number = 221;  
	        int firstDigit = number / 100;
	        int lastDigit = number % 10;

	        if (firstDigit == lastDigit) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }
	}
