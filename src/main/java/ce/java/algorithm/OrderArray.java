package ce.java.algorithm;

/**
 * 有序数组的二分法查找
 * 
 * @author Thinkpad
 *
 */
public class OrderArray {

	private long[] a;
	private int nElems;

	public OrderArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}
	
	/**
	 * 二分法查找
	 * @param searchKey
	 */
	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		
		while (true){
			curIn = (lowerBound + upperBound) /2;
			if(a[curIn] == searchKey) 
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;
			else {
				if(a[curIn] < searchKey){
					lowerBound = curIn + 1;
				} else {
					upperBound = curIn - 1;
				}
			}
		}
	}
	
	public int find2(long searchKey){
		return refind(searchKey, 0, nElems - 1);
	}
	
	/**
	 * 递归查找
	 * @return
	 */
	public int refind(long searchKey, int lowerBound, int upperBound){
		int curIn = (lowerBound + upperBound) / 2;
		if(a[curIn] == searchKey)
			return curIn;
		else if(lowerBound > upperBound)
			return nElems;
		else {
			if(a[curIn] < searchKey){
				return refind(searchKey, curIn+1, upperBound);
			} else {
				return refind(searchKey, lowerBound, curIn-1);
			}
		}
	}

	public void insert(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j] > value)
				break;
		for (int k = nElems; k > j; k--) 
			a[k] = a[k - 1];
		a[j] = value;
		nElems++;
	}
	
	public void display(){
		for(int j=0; j<nElems; j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int max = 100;
		OrderArray arr = new OrderArray(max);
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.insert(50);
		arr.insert(60);
		arr.insert(70);
		
		System.out.println("位置："+arr.find2(30));
	}
}
