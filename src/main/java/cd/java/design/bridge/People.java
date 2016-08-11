package cd.java.design.bridge;

public abstract class People {

	AbstractRoad road;  
	
	public void setRoad(AbstractRoad road){
		this.road = road;
	}
	
	abstract void who();
}
