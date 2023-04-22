import java.io.*;


public class q1 {
	
	public static void printAsterisks(int n)
	{
		if(n == 0)
			return;
		System.out.print("*");
		for(int i = 1; i < n; i++)
		{
			System.out.print("\n");
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
	}

	public static void main(String[] args)
	{
		printAsterisks(30);
		printAsterisks(5);
	}

}
