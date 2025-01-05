package decorator.car.ce;

/**
 * @author GRIGORY SHAULOV
 */
public class Main {

	public static void main(String[] args) {

		Vehicle carSedan = new Sedan("BMW", "M5");
		Vehicle carLimousine = new Limousine("HUMMER", "H2");
		Vehicle carExclusive = new Exclusive("Excalibur", "Phantom");
		Vehicle carSUV = new SUV("JEEP", "GRAND CHEROKEE");
		Vehicle carMinibus = new Minibus("Mercedes", "Sprinter 907");

		System.out.println("Sedan with Balloons and Wedding Rings");
		//enter code
		
		System.out.println("Limousine with Mr And Mrs Sign Banner and Wedding Rings");
		//enter code

		System.out.println("Exclusive with Just Married Wedding Banner");
		//enter code

		System.out.println("SUV with Wedding Dolls and Balloons");
		//enter code

		System.out.println("Minibus with Balloons");
		//enter code


		

	}

}
