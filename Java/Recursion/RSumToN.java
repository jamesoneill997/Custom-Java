import java.util.*;

public class RSumToN
{
	static int rsum(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n + rsum(n - 1);
		}

	}
}