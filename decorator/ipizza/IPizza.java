package ipizza;

public interface IPizza {

	String getDescription();

	int getCalories();

	double getPrice();

	default String getInfo() {
		return getDescription() + ".\tCalories: " + getCalories() + ".\tTotal Price: " + getPrice();
	}

}

/***
 

Name       Calories   Price     
---------- Pizza: ----------
Personal   98         40.0      
Family     200        60.0      
Huge       290        78.0      
---------- Ingredients: ----
Bulgarit   15         8.0       
Tomato     7          8.0       
Mushroom   21         8.0       
Olive      5          8.0       
----------------------------
Personal Pizza.	Calories: 98.	Total Price: 40.0
Family Pizza.	Calories: 200.	Total Price: 60.0
Huge Pizza.	Calories: 290.	Total Price: 78.0
Personal Pizza with Tomatos and Bulgarit.	Calories: 120.	Total Price: 56.0
Family Pizza with Mushrooms and Tomatos.	Calories: 228.	Total Price: 76.0
Huge Pizza with Olives and Mushrooms.	Calories: 316.	Total Price: 94.0

**/

