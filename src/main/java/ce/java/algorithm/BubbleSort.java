package ce.java.algorithm;

/**
 * 冒泡算法
 * @author Thinkpad
 *
 */
public class BubbleSort {
	
	private long[] a;
	private int nElems;
	
	public BubbleSort(int max){
		a = new long[max];
		this.nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems ++;
	}
	
	public void display(){
		for(int j=0; j<nElems; j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("");
	}
	
	public void sort(){
		int out, in;
		for(out=nElems-1; out>1; out--){  //n次
			for(in =0; in<out; in++){     //n/2次
				if(a[in]>a[in+1])
					swap(in , in+1);
			}
		}
	}
	
	private void swap(int one, int two){
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	public static void main(String[] args) {
		int maxSize =100;
		BubbleSort bubble = new BubbleSort(maxSize);
		bubble.insert(10);
		bubble.insert(20);
		bubble.insert(50);
		bubble.insert(30);
		bubble.insert(40);
		
		bubble.display();
		
		bubble.sort();
		bubble.display();
	}
}
