package decorator.car.ces;

public class BalloonsCarDecorator extends CarDecorator {

	public BalloonsCarDecorator(ICar decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public String toString() {
		return decoratedCar + (decoratedCar instanceof Vehicle ? " decorated with: Balloons" : ", Balloons");

	}

}
