import java.util.*;

public class RMin
{
	static int minimum(List<Integer> nums)
	{
		if(nums.size() == 0)
		{
			return 0;
		}

		if(nums.size() == 1)
		{
			return nums.get(0);
		}

		else
		{
			if(nums.get(0) < nums.get(1))
			{
				nums.remove(1);
			}
			else
			{
				nums.remove(0);
			}

			return minimum(nums);
		}

	}
}