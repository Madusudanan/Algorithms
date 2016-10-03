
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

}
