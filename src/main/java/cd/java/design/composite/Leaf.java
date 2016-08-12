package cd.java.design.composite;

/**
 * 叶子构建
 * @author Thinkpad
 *
 */
public class Leaf extends Component {

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("leaf doing!!!");
	}

}
