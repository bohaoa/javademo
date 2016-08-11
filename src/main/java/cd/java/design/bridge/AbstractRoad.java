package cd.java.design.bridge;

public abstract class AbstractRoad {
	
	AbstractCar car;
	
	public void setCar(AbstractCar car){
		this.car = car;
	}
	
	abstract void selectRoad();
}
