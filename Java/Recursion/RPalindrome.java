import java.util.*;

public class RPalindrome
{
	public static void main(String[] args)
	{
		String testCase1 = "Hello";
		String testCase2 = "This is an example string";
		String pal = "racecar";

		System.out.printf(" 'Hello' - %b%n",RecPalindrome.isPal(testCase1));
		System.out.printf(" 'racecar' - %b%n",RecPalindrome.isPal(pal));
		
		
	}
}