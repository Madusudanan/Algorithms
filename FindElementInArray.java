
public class FindElementInArray {

    /**
     * Brute force way to find an element in an array
     * Keep in mind that this method is the best way to find an element if the given array is not sorted
     * O(n) complexity
    */
    public static int findElementBruteForce(int data_array[],int numberToBeFound){
        for(int i=0;i<data_array.length;i++){
            if(data_array[i] == numberToBeFound){
                return i;
            }
        }

        return -1;
    }
    
     /**
     * Uses the binary search mechanism to find an element in O(logn) time
     * The algorithm assumes that the passed in data array is already sorted
     * @param data_array
     * @param numberToBeFound
     * @return
     */
    public static int findElementInSortedArray(int data_array[],int numberToBeFound){

        int lower_bound = 0;
        int upper_bound = data_array.length - 1;
        int middle = 0;
        while (lower_bound <= upper_bound) {
            middle = (lower_bound + upper_bound) / 2;
            if (numberToBeFound < data_array[middle]) {
                upper_bound = middle - 1;
            } else if (numberToBeFound > data_array[middle]) {
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
