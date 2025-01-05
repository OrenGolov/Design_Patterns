package decorator.car.ces;

public abstract class CarDecorator implements ICar {
	protected ICar decoratedCar;

	public CarDecorator(ICar decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	public ICar getDecoratedCar() {
		return decoratedCar;
	}

	public void setDecoratedCar(ICar decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

}
