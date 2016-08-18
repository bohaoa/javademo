package ce.java.algorithm;

/**
 * 归并排序算法
 * @author Thinkpad
 *
 */
public class MergeSort {

	private long[] theArray;
	private int nElems;
	
	public MergeSort(int max){
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
	
	public void mergeSort(){
		long[] workspace = new long[nElems];
		reMergeSort(workspace, 0, nElems-1);
	}
	
	public void reMergeSort(long[] workspace, int lowerBound, int upperBound){
		if(lowerBound == upperBound) return;
		else {
			int mid = (lowerBound + upperBound) / 2;
			reMergeSort(workspace, lowerBound, mid); // 0 3
			reMergeSort(workspace, mid+1, upperBound);//4 7
			merge(workspace, lowerBound, mid+1, upperBound); // 0 4 7
		}
	}
	
	/**
	 * 双合并数据
	 * @param workspace
	 * @param lowPtr
	 * @param highPtr
	 * @param upperBound
	 */
	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound){ //0 4 7
		int j = 0;
		int lowerBound = lowPtr;//0
		int mid = highPtr - 1;//3
		int n = upperBound - lowerBound + 1;//8
		
		while (lowPtr <= mid && highPtr <= upperBound)
			if(theArray[lowPtr] < theArray[highPtr])
				workspace[j++] = theArray[lowPtr++];
			else 
				workspace[j++] = theArray[highPtr++];
		while (lowPtr <= mid) 
			workspace[j++] = theArray[lowPtr++];
		while (highPtr <= upperBound)
			workspace[j++] = theArray[highPtr++];
		for(j=0; j<n; j++){
			theArray[lowerBound+j] = workspace[j];
		}
	}
	
	
	public static void main(String[] args) {
		int maxSize = 100;
		MergeSort sort = new MergeSort(maxSize);
		sort.insert(10);
		sort.insert(20);
		sort.insert(1);
		sort.insert(2);
		sort.insert(22);
		sort.insert(30);
		sort.display();
		
		sort.mergeSort();
		
		sort.display();
	}
}
