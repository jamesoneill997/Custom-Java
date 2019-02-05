import java.util.*;
public class RecListTest
{
	public static void main(String[] args)
	{
		List<String> in = new ArrayList<String>();

		in.add("Hello");
		in.add("World");

		System.out.println(RecList.makestring(in));
	}
}