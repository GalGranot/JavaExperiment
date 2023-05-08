import java.util.Random;


public class q3
{
	public static void printRandMatrix(int col, int row)
	{
		Random rand = new Random();
		for(int i = 0; i < col; i++)
		{
			for(int j = 0; j < row; j++)
			{
				int tmp = rand.nextInt(2);
				System.out.print(tmp);
				if(j != row)
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args)
	{
		printRandMatrix(11, 34);
	}

}
