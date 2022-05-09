import java.util.HashSet;
import java.util.Set;

public class MagicIndex {
    /*
    1) Magic Index: A magic index in an array A [ 0 ... n -1] is defined to be an index such that A[i] = i.
     Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.

    Follow up: What if the values are not distinct?
     */


    //finds the first magic index, could find all by returning a list of integers
    //Returns -1 if there is no magic Index
    public static int magicIndex(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            //This checks the set to see if the number has already been seen, if it has it skips to the next value of i
            //This is because if the numbers are distinct, if we have 2 before index 2, we know that index 2 can never
            //be a magic index
            if (set.contains(i)) {
                continue;
            }
            if (i == arr[i]) {
                return i;
            } else {
                set.add(arr[i]);
            }
        }
        return -1;
    }
}