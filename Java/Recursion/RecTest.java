import java.util.*;

public class RecTest
{
	public static void main(String[] args)
	{
		List<Integer> ints = new ArrayList<Integer>();

		ints.add(5);
		ints.add(6);
		ints.add(8);

		System.out.println(Recursion.count(ints));
	}
}