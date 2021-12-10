
public class IterativeLinearSearch {

	public static void main(String[] args) {
		int arr[] = {15,5,20,35,2,42,67,17}; // the array
		int found = 0; // set found to false
		int data = 2; // the data to search
		for(int i = 0; i < arr.length;i++) {  // iterating through the array
			if(arr[i] == data) { // if current data is equals to data being searched,
				System.out.println("element found at index " + i); 
				found = 1; // if element to search is found, then found = true
				break; // after finding the element , break from the loop
				
			} 
		}
			if(found == 0) {     // if found is false,
				System.out.println("element not found"); 
			}
		}
	}


