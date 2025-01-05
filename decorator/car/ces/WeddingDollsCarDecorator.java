package decorator.car.ces;

public class WeddingDollsCarDecorator extends CarDecorator{
	public WeddingDollsCarDecorator(ICar decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public String toString() {
		return decoratedCar + (decoratedCar instanceof Vehicle ? " decorated with: Wedding Dolls" : ", Wedding Dolls");
	}
}
