import java.util.*;

public class RDisplayArray
{
	static int display(List<Integer> a)
	{
		if(a.size() == 0)
		{	
			return 0;
		}

		if(a.size() == 1)
		{
			return 1;
		}

		else
		{
			return 1 + display(a.subList(1,a.size()));
		}


	}
}
