package ipizza;

public class Mushroom extends IPizzaDecorator {

	public Mushroom(IPizza iPizza) {
		super(iPizza);
	}

	@Override
	public String getDescription() {
		return decoratedIPizza.getDescription() + (decoratedIPizza instanceof Pizza ? " with " : " and ") + "Mushrooms";
	}

	@Override
	public int getCalories() {
		return decoratedIPizza.getCalories() + 21;
	}

	@Override
	public double getPrice() {
		return decoratedIPizza.getPrice() + 8;
	}

	@Override
	public String getName() {
		return "Mushroom";
	}
}
