package cd.java.design.simpleFactory;

public class Client {

	public static void main(String[] args) {
		Food food = FoodFactory.getFood(Chips.class.getSimpleName());
		food.get();
	}

}
