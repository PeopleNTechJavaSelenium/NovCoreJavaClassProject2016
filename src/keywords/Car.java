package keywords;

public class Car {
	
	public int carSize;
	public static int numberOfWheels;
	public final static int numberOfEngine = 1;
	
	public void start(){
		System.out.println("start the engine before driver");
	}
	public static void stop(){
		System.out.println("hit the break to stop");
	}
	public final void driveOnCruise(){
		System.out.println("cruise control");
	}

}
