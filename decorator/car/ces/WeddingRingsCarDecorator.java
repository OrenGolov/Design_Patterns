package decorator.car.ces;

public class WeddingRingsCarDecorator extends CarDecorator {

	public WeddingRingsCarDecorator(ICar decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public String toString() {
		return decoratedCar + (decoratedCar instanceof Vehicle ? " decorated with: Wedding Rings" : ", Wedding Rings");
	}

}
