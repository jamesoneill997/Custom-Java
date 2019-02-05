import java.util.*;
public class Recursion
{
	public static int count(List<Integer> input)
	{
		if(input.size() == 0)
		{
			return 0;
		}
		else
		{
			return 1 + count(input.subList(0,input.size()-1));
		}
	}	
}