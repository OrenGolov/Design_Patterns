package decorator.abc.ces;


public final class LowerABC extends ABCDecorator {

	public LowerABC(ABC abc) {
		super(abc);
	}

	@Override
	public String toString() {
		return getABC();
	}

	@Override
	public String getABC() {
		return decoratedABC.getABC().toLowerCase();
	}
}
