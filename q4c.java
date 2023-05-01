import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class q4
{
	
	public static int countNonEmpty(List<String> strs)
	{
		return (strs.size()) - (int)(strs.stream().filter(string -> string.isEmpty()).count());
	}
	
	public static List<String> getNonEmptyStrs(List<String> strs)
	{
		List<String> nonEmptyStrs = new ArrayList<>();
		for (String str:strs)
		{
			if(!str.isEmpty())
				nonEmptyStrs.add(str);
		}
		return nonEmptyStrs;
	}
	
	public static void main(String[] args)
	{
		final List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		System.out.print(countNonEmpty(strings));
		System.out.print("\n");
		System.out.print(getNonEmptyStrs(strings));
	}
}

