package decorator.abc.ces;


public final class DoubleABC extends ABCDecorator {

	public DoubleABC(ABC abc) {
		super(abc);
	}

	@Override
	public String toString() {
		return getABC();
	}

	@Override
	public String getABC() {
		return decoratedABC.getABC() + decoratedABC.getABC();
	}
}
