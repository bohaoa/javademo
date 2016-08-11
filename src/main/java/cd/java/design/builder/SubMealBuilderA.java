package cd.java.design.builder;

public class SubMealBuilderA extends MealBuilder
{
	public void buildFood()
	{
		meal.setFood("food1");
	}
	public void buildDrink()
	{
	    meal.setDrink("drink1");
	}
}