package cd.java.design.builder;

public class Client {

	public static void main(String[] args) {
		MealBuilder builder = new SubMealBuilderA();
		KFCWaiter kfc = new KFCWaiter();
		kfc.setMealBuilder(builder);
		Meal meal = kfc.construct();
		System.out.println(meal.getDrink()+">"+meal.getFood());
	}

}
