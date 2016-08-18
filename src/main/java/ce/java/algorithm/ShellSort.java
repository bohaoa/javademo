package ce.java.algorithm;

/**
 * 希尔排序算法
 * @author Thinkpad
 */
public class ShellSort {

	private long[] theArray;
	private int nElems;
	
	public ShellSort(int max){
		theArray = new long[max];
		this.nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems ++;
	}
	
	public void display(){
		for(int j=0; j<nElems; j++){
			System.out.print(theArray[j]+" ");
		}
		System.out.println("");
	}

	public void sort(){
		int inner, outer;
		long temp;
		int h = 1;
		
		while (h <= nElems/3) {
			h = h*3 + 1;  //4
		}
		
		while (h>0) {
			for(outer=h; outer<nElems; outer++){ //4 10
				temp = theArray[outer];
				inner = outer;
				
				while (inner>h-1 && theArray[inner-h] >= temp){
					theArray[inner] = theArray[inner-h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = (h-1)/3;
		}
	}
	
	public static void main(String[] args) {
		int maxSize = 10;
		ShellSort sort = new ShellSort(maxSize);
		for(int j=0; j<maxSize; j++){
			long n = (int)(Math.random()*99);
			sort.insert(n);
		}
		sort.display();
		sort.sort();
		sort.display();
	}
	
}
