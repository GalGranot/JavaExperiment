package lab1;

abstract class vehicle
{
	float gpk;
	String maker;
	String color;
	float tankSize;
	float gas;
	int tires;
	
	public String toString()
	{
		return (color + " " +  maker + " " + gas + "/" + tankSize);
	}
	
	public boolean drive(float distance)
	{
		if(gas >= distance * gpk)
			{
				gas -= distance * gpk;
				return true;
			}
		else return false;
	}
	
	public float fillGas(float literPrice)
	{
		float price = (tankSize - gas) * literPrice;
		gas = tankSize;	
		return price;
	}
	
	public void changeTires()
	{
		System.out.println(tires);
	}
	
}
