package keywords;

public class SuperCar extends Car{
	
	public void flyingFeature(){
		System.out.println("car can fly");
	}
	
	@Override
	public void start(){
		System.out.println("have aeroplane engine to start");
	}


}
