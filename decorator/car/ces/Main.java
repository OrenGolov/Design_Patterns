package decorator.car.ces;

public class Main {

	public static void main(String[] args) {

		ICar carSedan = new Sedan("BMW", "M5");
		ICar carLimousine = new Limousine("HUMMER", "H2");
		ICar carExclusive = new Exclusive("Excalibur", "Phantom");
		ICar carSUV = new SUV("JEEP", "GRAND CHEROKEE");
		ICar carMinibus = new Minibus("Mercedes", "Sprinter 907");

		System.out.println("Sedan with Balloons and Wedding Rings");
		System.out.println(new WeddingRingsCarDecorator(new BalloonsCarDecorator(carSedan)));
		System.out.println();
		
		System.out.println("Limousine with Mr And Mrs Sign Banner and Wedding Rings");
		System.out.println(new WeddingRingsCarDecorator(new MrAndMrsSignCarDecorator(carLimousine)));
		System.out.println();

		System.out.println("Exclusive with Just Married Wedding Banner");
		System.out.println(new JustMarriedCarDecorator(carExclusive));
		System.out.println();

		System.out.println("SUV with Wedding Dolls and Balloons");
		System.out.println(new BalloonsCarDecorator(new WeddingDollsCarDecorator(carSUV)));
		System.out.println();

		System.out.println("Minibus with Balloons");
		System.out.println(new BalloonsCarDecorator(carMinibus));
		System.out.println();

	}

}
