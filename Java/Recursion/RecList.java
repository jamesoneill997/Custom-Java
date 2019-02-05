import java.util.*;
public class RecList
{
	static String makestring(List<String> input)
	{
		String elems = "";

		if(input.size() == 0)
		{
			return elems;
		}

		else
		{
			return elems + input.get(0) + makestring(input.subList(1,input.size()));
		}
	}

}