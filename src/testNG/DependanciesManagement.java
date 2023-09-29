package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	@Test(enabled=true)
	private void highSchool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods="highSchool")
	private void higherSecondary() {
		System.out.println("Higher Secondary");
	}

	@Test(dependsOnMethods="higherSecondary")
	private void engineering() {
		System.out.println("College");
	}
}
