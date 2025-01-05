package ipizza;

public class Main {

	public static void main(String[] args) {
		IPizza demo = new IPizza() {

			@Override
			public double getPrice() {
				return 0;
			}

			@Override
			public String getDescription() {
				return "";
			}

			@Override
			public int getCalories() {
				return 0;
			}
		};

		System.out.printf("%-10s %-10s %-10s\n", "Name", "Calories", "Price");

		System.out.println("---------- Pizza: ----------");
		Pizza personal = new Personal();
		Pizza family = new Family();
		Pizza huge = new Huge();
		System.out.printf("%-10s %-10s %-10s\n", personal.getName(), personal.getCalories(), personal.getPrice());
		System.out.printf("%-10s %-10s %-10s\n", family.getName(), family.getCalories(), family.getPrice());
		System.out.printf("%-10s %-10s %-10s\n", huge.getName(), huge.getCalories(), huge.getPrice());

		System.out.println("---------- Ingredients: ----");
		IPizzaDecorator bulgarit = new Bulgarit(demo);
		IPizzaDecorator tomato = new Tomato(demo);
		IPizzaDecorator mushroom = new Mushroom(demo);
		IPizzaDecorator olive = new Olive(demo);
		System.out.printf("%-10s %-10s %-10s\n", bulgarit.getName(), bulgarit.getCalories(), bulgarit.getPrice());
		System.out.printf("%-10s %-10s %-10s\n", tomato.getName(), tomato.getCalories(), tomato.getPrice());
		System.out.printf("%-10s %-10s %-10s\n", mushroom.getName(), mushroom.getCalories(), mushroom.getPrice());
		System.out.printf("%-10s %-10s %-10s\n", olive.getName(), olive.getCalories(), olive.getPrice());
		System.out.println("----------------------------");

		IPizza bulgaritTomatos = new Bulgarit(new Tomato(personal));
		IPizza tomatosMushrooms = new Tomato(new Mushroom(family));
		IPizza mushroomsOlives = new Mushroom(new Olive(huge));

		System.out.println(personal);
		System.out.println(family);
		System.out.println(huge);
		System.out.println(bulgaritTomatos);
		System.out.println(tomatosMushrooms);
		System.out.println(mushroomsOlives);
	}

}
