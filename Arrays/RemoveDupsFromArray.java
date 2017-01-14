
import java.util.*;

/**
 * Best solution in terms of space is third one - O(NLogN)
 * Best solution in terms of time is second one - O(N)
 * Need to explore counting sort
 */

/**
 * Contains various algorithms for removing duplicate elements from an array
 */
    public class RemoveDupsFromArray {

    public static void main(String[] args) {


        int data[] = {1,0,1,2,3,4,5,1,2,4,9,10};

        ArrayList<Integer> result;

        result = removeDupsUsingSorting(data);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }


    /**
     * Maintains a hashmap that is used to prevent dups
     * O(N) space, O(N) time
     * @param data
     * @return
     */
    public static ArrayList<Integer> removeDupsUsingHashMap(int data[]){

        //Map to find dups
        HashMap<Integer,Integer> numbersMap = new HashMap<>();

        //Result arraylist with dups removed
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0;i<data.length;i++) {
            if (numbersMap.get(data[i]) == null) {
                arrList.add(data[i]);
                numbersMap.put(data[i],data[i]);
            }
        }

        return arrList;


    }

    /**
     * Improved dups remover. Since a hashmap is a key value thing. A hash set is better
     * Still uses O(N) time and space
     */
    public static HashSet<Integer> removeDupsUsingHashSet(int data[]){

        HashSet<Integer> noDups = new HashSet<>();

        for(int i=0;i<data.length;i++){
            noDups.add(data[i]);
        }


        return noDups;

    }

    /**
     * Remove dups by sorting the array first. Then walk through the array to filter out intermediate same elements
     * Uses O(NLogN) time but consumes no extra space
     */
    public static ArrayList<Integer> removeDupsUsingSorting(int data[]){

        Arrays.sort(data);

        ArrayList<Integer> result = new ArrayList<>();

        int previous = data[0];

        result.add(previous);

        for(int i=1;i<data.length;i++){
            if(data[i]!=previous){
                result.add(data[i]);
            }

            previous = data[i];
        }

        return result;


    }






}
