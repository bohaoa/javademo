package cd.java.design.decorator;

public class Decorator implements Component {

	private Component component;
	
	public void setComponent(Component component){
		this.component = component;
	}
	
	public void oper(){
		component.oper();
	}
}
