package ipizza;

public abstract class IPizzaDecorator implements IPizza {
	protected IPizza decoratedIPizza;

	public IPizzaDecorator(IPizza iPizza) {
		this.decoratedIPizza = iPizza;
	}

	@Override
	public String toString() {
		return getInfo();
	}

	public abstract String getName();

}
