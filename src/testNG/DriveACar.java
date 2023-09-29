package testNG;

import org.testng.annotations.Test;

public class DriveACar {

	@Test(priority=0)
	private void startTheCar() {
		System.out.println("Start the Car");

	}

	@Test(priority=1)
	private void putFirstGear() {
		System.out.println("First Gear");

	}

	@Test(priority=2)
	private void putSecondGear() {
		System.out.println("Second Gear");

	}

	@Test(priority=3)
	private void putThirdGear() {
		System.out.println("Third Gear");

	}

	@Test(priority=4)
	private void putFourthGear() {
		System.out.println("Fouth Gear");

	}

	@Test(priority=5)
	private void putFifthGear() {
		System.out.println("Fifth Gear");

	}

}
