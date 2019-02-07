import java.util.*;

public class RDisplayArray
{
	static String display(List<Integer> a)
	{
		if(a.size()==0)
		{
			return "";
		}

		if(a.size() == 1)
		{
			return Integer.toString(a.get(0));
		}

		else
		{
			return Integer.toString(a.get(0)) + " " + display(a.subList(1,a.size()));
		}

	}
}

