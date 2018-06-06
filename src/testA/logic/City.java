package testA.logic;

import java.util.ArrayList;

/**
 * The task: Create a City class with an internal class, using which objects you
 * can store information about avenues, streets, squares.
 */

public class City {

	private String name;
	private double square;
	private int popul;
	private String state;
	private ArrayList<CityObject> cityObjects;

	public City(String name, double square, int popul, String state) {
		this.name = name;
		this.square = square;
		this.popul = popul;
		this.state = state;
		this.cityObjects = new ArrayList<CityObject>();
	}

	public ArrayList<CityObject> getCityObjects() {
		return cityObjects;
	}

	public void addObject(CityObject co) {
		getCityObjects().add(co);
	}

	@Override
	public String toString() {
		return "City: " + name + "\nSquare: " + square + " square metres, " + "\nPopulation: " + popul + "poeple, "
				+ "\nState: " + state;
	}

	public static class CityObject {

		private String name;
		private String type;
		private int numberOfBuildings;
		private String districr;

		public CityObject(String name, String type, int numberOfBuildings, String district) {
			this.name = name;
			this.type = type;
			this.numberOfBuildings = numberOfBuildings;
			this.districr = district;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getNumberOfBuildings() {
			return numberOfBuildings;
		}

		public void setNumberOfBuildings(int numberOfBuildings) {
			this.numberOfBuildings = numberOfBuildings;
		}

		public String getDistricr() {
			return districr;
		}

		public void setDistricr(String districr) {
			this.districr = districr;
		}

		public void addBuildingsToPoints(int n) {
			setNumberOfBuildings(getNumberOfBuildings() + n);
		}

		public void removeBuildingsToPoints(int n) {
			setNumberOfBuildings(getNumberOfBuildings() - n);
		}

		@Override
		public String toString() {
			return getName() + " " + getType() + "\nin operaton " + getNumberOfBuildings() + " builgings " + "\n "
					+ getDistricr() + " district";
		}
	}

}
