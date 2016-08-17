package ce.java.algorithm;

/**
 * 插入排序
 * @author Thinkpad
 *
 */
public class InsertSort {

	private long[] a;
	private int nElems;
	
	public InsertSort(int max){
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
	
	public void insertSort(){
		int in, out;
		for(out = 1; out<nElems; out++){ // n
			long temp = a[out];
			in = out;
			while(in > 0 && a[in-1] >= temp){ // n/2
				a[in] = a[in-1];
				-- in;
			}
			a[in] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		int maxSize = 100;
		InsertSort bubble = new InsertSort(maxSize);
		bubble.insert(100);
		bubble.insert(20);
		bubble.insert(10);
		bubble.insert(50);
		bubble.insert(30);
		bubble.insert(40);
		
		bubble.display();
		
		bubble.insertSort();
		bubble.display();
	}
	
}
