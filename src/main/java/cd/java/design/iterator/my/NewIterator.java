package cd.java.design.iterator.my;

public class NewIterator implements MyIterator {

	private Object[] obj={"dog","pig","cat","monkey","pig"};
	 
	private int currentIndex = 0;

	public void first() {
		currentIndex = 0;
	}

	public void next() {
		if (currentIndex < obj.length) {
			currentIndex++;
		}
	}

	public void previous() {
		if (currentIndex > 0) {
			currentIndex--;
		}
	}

	public boolean isLast() {
		return currentIndex == obj.length;
	}

	public boolean isFirst() {
		return currentIndex == 0;
	}

	public Object currentItem() {
		return obj[currentIndex];
	}

}
