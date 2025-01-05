package decorator.abc.ce;

public final class B implements ABC {
	private char value = 'B';

	public B() {
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