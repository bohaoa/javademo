package cd.java.design.simpleFactory;

public class FoodFactory {

	public static Food getFood(String type){
		Food food = null;
		try {
			food = (Food) Class.forName("cd.java.design.simpleFactory."+type).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return food;
	}
}
