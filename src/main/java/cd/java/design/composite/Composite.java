package cd.java.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 * @author Thinkpad
 *
 */
public class Composite extends Component {

	private List list = new ArrayList();
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return (Component) list.get(i);
	}

	@Override
	public void operation() {
		for(Object obj : list){
			((Component)obj).operation();
		}
	}

}
