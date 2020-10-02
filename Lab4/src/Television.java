/** 

*The purpose of this class is to model a television

*Your name and today’s date

*/



public class Television {

	

	private  final String MANUFACTURER;  //hold the brand name.

	private final int SCREEN_SIZE;    		 //hold the size of the television screen

	private boolean powerOn;     //hold the value true 

	private int channel;        		 //hold the value of the station

	private int volume;        			 //hold a number value representing the loudness

	

	

	//Assigns the value to the fields in television

	public Television(String brand, int Size)

	{

		MANUFACTURER = brand;

		SCREEN_SIZE = Size;

		volume = 20;

		channel = 20;

	}



	public int getVolume()

	{

		return volume;

	}

	

	public int getChannel()

	{

		return channel;

	}

	

	public String getManufacturer()

	{

		return MANUFACTURER;

	}

	

	public int getScreenSize()

	{

		return SCREEN_SIZE;

	}

	

	/**

	 *Setting the channel

	 */

	

	public void setChannel(int Station)

	{

		this.channel = Station;

		

	}

	

	/**

	 *Status of the power

	 */

	

	public void power()

	{

		powerOn = !powerOn;

	}

	

	/**

	 *Increasing the volume

	 */

	

	public void increaseVolume()

	{

		this.volume+= 1;

	}

	

	/**

	 *Decreasing the volume

	 */

	

	public void decreaseVolume()

	{

		this.volume-= 1;

	}

}