package decorator.abc.ces;


public final class C implements ABC {
	private char value = 'C';

	public C() {
	}


	@Override
	public String toString() {
		return getABC();
	}

	@Override
	public String getABC() {
		return String.valueOf(value);
	}
}


