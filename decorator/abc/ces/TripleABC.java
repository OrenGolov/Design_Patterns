package decorator.abc.ces;


public final class TripleABC extends ABCDecorator {

	public TripleABC(ABC abc) {
		super(abc);
	}

	@Override
	public String toString() {
		return getABC();
	}

	@Override
	public String getABC() {
		return decoratedABC.getABC() + decoratedABC.getABC() + decoratedABC.getABC();
	}
}
