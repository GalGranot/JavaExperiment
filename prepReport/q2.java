
public class q2
{
	public static void printSeq(int a1, int distance, int n)
	{
		for(int i = 0; i < n; i++)
		{
			int tmp = a1 + i * distance;
			System.out.print(tmp + " ");
		}
	}
	
	public static void main(String[] args)
	{
		printSeq(1, 3, 500);
	}
}
