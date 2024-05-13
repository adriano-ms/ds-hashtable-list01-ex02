package model;

import java.util.Objects;

public class Resident {
	
	private Integer apartment;
	private String name;
	private String carModel;
	private String carColor;
	private String carPlate;
	
	public Resident() {
		super();
	}
	
	public Resident(Integer apartment, String name, String carModel, String carColor, String carPlate) {
		this.apartment = apartment;
		this.name = name;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPlate = carPlate;
	}

	public Integer getApartment() {
		return apartment;
	}

	public void setApartment(Integer apartment) {
		this.apartment = apartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	@Override
	public int hashCode() {
		return apartment / 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resident other = (Resident) obj;
		return Objects.equals(apartment, other.apartment);
	}

	@Override
	public String toString() {
		return "Resident [apartment=" + apartment + ", name=" + name + ", carModel=" + carModel + ", carColor="
				+ carColor + ", carPlate=" + carPlate + "]";
	}

}
