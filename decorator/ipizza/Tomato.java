package ipizza;

public class Tomato extends IPizzaDecorator {

	public Tomato(IPizza iPizza) {
		super(iPizza);
	}

	@Override
	public String getDescription() {
		return decoratedIPizza.getDescription() + (decoratedIPizza instanceof Pizza ? " with " : " and ") + "Tomatos";
	}

	@Override
	public int getCalories() {
		return decoratedIPizza.getCalories() + 7;
	}

	@Override
	public double getPrice() {
		return decoratedIPizza.getPrice() + 8;
	}

	@Override
	public String getName() {
		return "Tomato";
	}

}
