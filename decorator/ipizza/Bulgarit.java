package ipizza;

public class Bulgarit extends IPizzaDecorator {

	public Bulgarit(IPizza iPizza) {
		super(iPizza);
	}

	@Override
	public String getDescription() {
		return decoratedIPizza.getDescription() + (decoratedIPizza instanceof Pizza ? " with " : " and ") + "Bulgarit";
	}

	@Override
	public int getCalories() {
		return decoratedIPizza.getCalories() + 15;
	}

	@Override
	public double getPrice() {
		return decoratedIPizza.getPrice() + 8;
	}

	@Override
	public String getName() {
		return "Bulgarit";
	}

}
