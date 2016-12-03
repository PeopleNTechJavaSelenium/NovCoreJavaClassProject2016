package keywords;

public class TestCar {


	public static void main(String[] args) {
		Car toyota = new Car();
		toyota.start();
		System.out.println("Toyota Car size : " + toyota.carSize);
		System.out.println("Toyota Car's numberOfWheels : " + toyota.numberOfWheels);
		Car.stop();
		System.out.println("Number of Wheels : " + Car.numberOfWheels);
		
		Car nissan = new Car();
		nissan.carSize = 15;
		System.out.println("Nissan Car size: " + nissan.carSize);
		System.out.println("Toyota Car size : " + toyota.carSize);
		System.out.println("Nissan Car's numberOfWheels : " + nissan.numberOfWheels);
		nissan.numberOfWheels = 6;
		System.out.println("Nissan Car's numberOfWheels : " + nissan.numberOfWheels);
		System.out.println("Toyota Car's numberOfWheels : " + toyota.numberOfWheels);
		
		SuperCar aeroMobile = new SuperCar();
		aeroMobile.start();

	}

}
