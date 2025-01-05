package decorator.car.ces;

public class JustMarriedCarDecorator extends CarDecorator {

	public JustMarriedCarDecorator(ICar decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public String toString() {
		return decoratedCar + (decoratedCar instanceof Vehicle ? " decorated with: Just Married Wedding Banner" : ", Just Married Wedding Banner");

	}

}
