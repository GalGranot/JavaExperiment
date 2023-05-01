package lab1;

import java.io.*;

public class Car extends vehicle
{
	public Car(float in_gpk, String in_maker, String in_color, float in_tankSize)
	{
		gpk = in_gpk;
		maker = in_maker;
		color = in_color;
		tankSize = in_tankSize;
		gas = in_tankSize;
		tires = 4;
	}


}
