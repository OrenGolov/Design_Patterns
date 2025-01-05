package decorator.abc.ces;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC simpleA = new A();
		ABC simpleB = new B();
		ABC simpleC = new C();
		System.out.println(simpleA.getABC());
		System.out.println(simpleB.getABC());
		System.out.println(simpleC.getABC());

		ABC lowerA = new LowerABC(simpleA);
		System.out.println(lowerA.getABC());

		ABC doubleB = new DoubleABC(simpleB);
		System.out.println(doubleB.getABC());

		ABC tripleC = new TripleABC(simpleC);
		System.out.println(tripleC.getABC());
		
		ABC triple2C = new TripleABC(new TripleABC(simpleC));
		System.out.println(triple2C.getABC());

	}

}
