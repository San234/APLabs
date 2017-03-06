class ACMEBicycle implements Bicycle
{
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newValue)
	{
		cadence = newValue;
	}
	public void changeGear(int newValue)
	{
		gear = newValue;
	}
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	
	void printStates()
	{
		System.out.println("Cadence: " + cadence + "\nSpeed: " + speed + "\nGear: " + gear);
	}
}