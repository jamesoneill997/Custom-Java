import java.util.*;

public class RZeroCount
{
	static int total(List<Integer> nums)
	{
		if(nums.size() == 0)
		{
			return 0;
		}

		else
		{
			if(nums.get(0) == 0)
			{
				return 1 + total(nums.subList(1,nums.size()));
			}	
		}
	return 0;
	}
}
