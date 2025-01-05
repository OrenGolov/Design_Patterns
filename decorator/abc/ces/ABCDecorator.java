package decorator.abc.ces;


public abstract class ABCDecorator implements ABC {
	protected ABC decoratedABC;

	public ABCDecorator(ABC abc) {
		this.decoratedABC = abc;
	}

}
