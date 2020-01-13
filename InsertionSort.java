
public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {10,5,3,7,2}, key=0,i,k,j,x;
		System.out.println("Unsorted Array :");
		for(x=0;x<arr.length;x++)
		System.out.print(arr[x]+ " ");
		System.out.println();
		for (i = 1; i < arr.length; i++) 
	    {  
	        key = arr[i];  
	        j = i-1;  
	        while (j>=0 && arr[j]>key) 
	        {  
	            arr[j+1] = arr[j];  
	            j = j-1;  
	        }  
	        arr[j+1] = key;  
	       
	    }  
		System.out.println("Sorted Array :");
		for(k=0;k<arr.length;k++)
		System.out.print(arr[k]+ " ");

	}

}
