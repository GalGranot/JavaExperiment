package lab1;

public class CargoShip extends SpaceShip
{
	ParkingLot lot;
	
	public CargoShip(int in_size, int in_fee)
	{
		lot = new ParkingLot(in_size, in_fee);
	}
	
	public String toString()
	{
		return (super.toString() + this.lot.svt.size() + "/" + this.lot.svt.maxKey);
	}
	
	public boolean enter(vehicle v, float expectedTime)
	{
		return this.lot.enter(v, expectedTime);
	}
	
	public boolean exit(vehicle v) throws VehicleNotFoundException
	{
		boolean tmp = this.lot.exit(v);
		if(!tmp)
			throw new VehicleNotFoundException("VehicleNotFoundException");
		return true;
	}
	
}
