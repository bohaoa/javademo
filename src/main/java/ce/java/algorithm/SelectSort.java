package ce.java.algorithm;
/**
 * 选择排序
 * @author Thinkpad
 *
 */
public class SelectSort {

	private long[] a;
	private int nElems;
	
	public SelectSort(int max){
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
	
	/**
	 */
	public void selectSort(){
		int out, in, min;
		for(out=0; out<nElems-1; out++){     //  n
			min = out;
			for(in = out+1; in<nElems; in++){//  n/2
				if(a[min]>a[in]) {
					min = in;
				}
			}
			//打一个标记，放到最后替换
			long temp = a[out];
			a[out] = a[min];
			a[min] = temp;
		}
	}
	
	public static void main(String[] args) {
		int maxSize = 100;
		SelectSort bubble = new SelectSort(maxSize);
		bubble.insert(10);
		bubble.insert(20);
		bubble.insert(50);
		bubble.insert(30);
		bubble.insert(40);
		
		bubble.display();
		
		bubble.selectSort();
		bubble.display();
	}
}
