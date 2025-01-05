package ipizza;

public class Pizza implements IPizza {
	protected String name;
	protected int calories;
	protected double price;

	public Pizza(String name, int calories, double price) {
		setName(name);
		setCalories(calories);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getInfo();
	}

	@Override
	public String getDescription() {
		return name + " Pizza";
	}

}
