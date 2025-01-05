package decorator.car.ces;

/**
 * @author GRIGORY SHAULOV
 */
public abstract class Vehicle  implements ICar{

	protected String brand;
	protected String serial;

	public Vehicle(String brand, String serial) {
		this.brand = brand;
		this.serial = serial;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return brand + " " + serial;
	}

}
