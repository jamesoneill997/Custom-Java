import java.util.*;

public class RecRev
{
	static String rdisplay(List<Integer> a)
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
			return Integer.toString(a.get(a.size()-1)) + " " + rdisplay(a.subList(0,a.size()-1));
		}

	}
}
