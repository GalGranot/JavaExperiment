package lab1;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot
{
	SizeableVehicleStorage<vehicle, Float> svt;
	float fee;
	float bank = 0;
	
	public ParkingLot(int size, float in_fee)
	{
		this.svt = new SizeableVehicleStorage<vehicle, Float>(size);
		fee = in_fee;
	}
	
	public boolean enter(vehicle v, float expectedStay)
	{
		if(this.svt.size() == this.svt.maxKey)
			return false;
		this.svt.put(v, expectedStay);
		return true;
	}
	
	public boolean exit(vehicle v)
	{
		if(!this.svt.containsKey(v))
			return false;
		bank += fee * this.svt.remove(v);
		return true;
	}
	
	public float getBalance()
	{
		return bank;
	}
	
	public float getExpectedRevenue()
	{
		float sum = 0;
		for(float value : this.svt.values())
		{
			sum += value;
		}
		return sum * fee;
	}
	
	int countBikes()
	{
		return (int)svt.keySet().stream().filter(vehicle -> vehicle instanceof motorcycle).count();
	}
	
}
