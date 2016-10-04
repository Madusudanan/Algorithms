public class MaxElementInArray {


    /**
     * Uses a simple linear search for the maximum element in the array
     * @param data_array
     * @return
     */
    public static int findMaxElementInArray(int data_array[]){
        int max = -1;

        for(int i=0;i<data_array.length;i++){
            if(max < data_array[i]) {
                max = data_array[i];
            }
        }

        return max;
    }

}
