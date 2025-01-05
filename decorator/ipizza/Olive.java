package ipizza;

public class Olive extends IPizzaDecorator {

	public Olive(IPizza iPizza) {
		super(iPizza);
	}

	@Override
	public String getDescription() {
		return decoratedIPizza.getDescription() + (decoratedIPizza instanceof Pizza ? " with " : " and ") + "Olives";
	}

	@Override
	public int getCalories() {
		return decoratedIPizza.getCalories() + 5;
	}

	@Override
	public double getPrice() {
		return decoratedIPizza.getPrice() + 8;
	}

	@Override
	public String getName() {
		return "Olive";
	}
}
