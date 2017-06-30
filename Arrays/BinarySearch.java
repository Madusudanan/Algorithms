/* 
 Returns the index of the element in the Array.
 You have to pass in an array that is already sorted in ascending order,
 otherwise the algorithm will not find the element
*/
 
public class BinarySearch {

	public static int Binary_Search(int data_array[], int element) {

		int lower_bound = 0;
		int upper_bound = data_array.length - 1;
		int middle = 0;
		while (lower_bound <= upper_bound) {
			middle = (lower_bound + upper_bound) / 2;
			if (element < data_array[middle]) {
				upper_bound = middle - 1;
			} else if (element > data_array[middle]) {
				lower_bound = middle + 1;
			} else {
		  	//Element found
				return middle;
			}
		}
		// Return -1 if not found
		return -1;
	}
}
