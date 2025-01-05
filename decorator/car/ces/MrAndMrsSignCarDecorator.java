package decorator.car.ces;

public class MrAndMrsSignCarDecorator extends CarDecorator {

	public MrAndMrsSignCarDecorator(ICar decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public String toString() {
		return decoratedCar + (decoratedCar instanceof Vehicle ? " decorated with: Mr and Mrs Sign Banner" : ", Mr and Mrs Sign Banner");

	}

}
