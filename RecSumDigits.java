import java.util.*;

public class RecSumDigits
{
	static int addDigits(int a)
	{
		

		if(String.valueOf(a).length() == 0)
		{
			return 0;
		}

		String digit = Integer.toString(a);


		if(digit.length() == 1)
		{
			return Integer.parseInt(digit);
		}
		else
		{
			int head = Integer.parseInt(digit.substring(0,1));
			int tail = Integer.parseInt(digit.substring(1,digit.length()));

			return head + addDigits(tail);
		}
	}
}