package testA.run;

import testA.logic.City;
import testA.logic.City.CityObject;

/**
 * Demo class City
 */

public class RunCity {

	public static void main(String[] args) {

		City c1 = new City("NN", 200, 3000, "C1");
		CityObject cp1 = new CityObject("AA", "street", 26, "center");
		CityObject cp2 = new CityObject("BB", "avenue", 58, "east");
		CityObject cp3 = new CityObject("CC", "square", 2, "center");

		c1.addObject(cp1);
		c1.addObject(cp2);
		c1.addObject(cp3);

		cp1.addBuildingsToPoints(3);
		cp2.removeBuildingsToPoints(2);

		System.out.println(cp1.toString());
		System.out.println(cp2.toString());

	}

}
