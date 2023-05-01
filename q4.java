import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class q4c
{
	
	public static int getSumOfSquares(List<int> list)
	{
		return list.stream().mapToInt(n -> n * n).sum();
	}
	
	public static void main(String[] args)
	{		
		final List<int> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		return getSumOfSquares(list);
	}
}

