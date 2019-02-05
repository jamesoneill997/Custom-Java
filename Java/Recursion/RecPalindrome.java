import java.util.*;

public class RecPalindrome
{
	public static String revString(String input)
	{

		if(input.length() == 1)
		{
			return input;
		}

		else
		{
		return input.substring(input.length()-1) + revString(input.substring(0,input.length()-1));
		}
		
	}

	public static Boolean isPal(String test)
	{
		if(revString(test).equals(test))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}