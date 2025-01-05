package decorator.abc.ce;

public final class A implements ABC {
	private char value = 'A';

	public A() {
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