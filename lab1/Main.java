package lab1;

import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Main
{
	public static void main(String[] args)
	{
		List<vehicle> vehicleList = new ArrayList<vehicle>();
		Car c = new Car(8, "WV", "Orange", 40);
		motorcycle m = new motorcycle(20, "AR", "Gray", 10);
		truck t = new truck(20, "BMW", "Pink", 60);
		
		vehicleList.add(c);
		vehicleList.add(m);
		vehicleList.add(t);
		
		vehicleList.forEach((vehicle) ->
		{
			System.out.print(vehicle.toString() + " Number of tires = "); vehicle.changeTires();
		}
		);
	}
}
