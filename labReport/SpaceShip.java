package lab1;
import java.io.*;

abstract public class SpaceShip extends vehicle
{
	public SpaceShip(float in_gpk, String in_maker, String in_color, float in_tankSize)
	{
		gpk = in_gpk;
		maker = in_maker;
		color = in_color;
		tankSize = in_tankSize;
		gas = in_tankSize;
	}

	
	public boolean liftoff(float distance)
	{
		return super.drive(distance);
	}
	
	public void shoot()
	{
		//shoot the chicken!
		System.out.println("Bcuck!");
	}
	
	public void changeTires()
	{
		System.out.println("Bcuck!");
		System.out.println("also this is not used");
	}
}
