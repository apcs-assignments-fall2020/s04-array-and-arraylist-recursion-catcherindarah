import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        // YOUR CODE HERE
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (i == (list.size() - 1))
        {
            return true;
        }
        if (list.get(i+1) < list.get(i))
        {
            return false;
        }
        else
        {
            return isSortedRec(list, i+1);
        }

    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (i == arr.length)
        {
            if (count == 0)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        if(arr[i] == x)
        {
            count--;
            return (hasCountCopiesRec(arr, x, count, i+1));
        }
        else
        {
            return (hasCountCopiesRec(arr, x, count, i+1));
        }
    }





    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        if ((arr[lowerBound + (upperBound-lowerBound)/2]) == num)
        {
            return true;
        }
        if (lowerBound > upperBound)
        {
            return false;
        }
        if ((arr[lowerBound + (upperBound-lowerBound)/2]) > num)
        {
            return binarySearchRec(arr, num, lowerBound, lowerBound + (upperBound-lowerBound)/2 - 1);
        }
        else
        {
            return binarySearchRec(arr, num, lowerBound + (upperBound-lowerBound)/2 + 1, upperBound);
        }
    }

    public static void main(String[] args) {
        
    }
}
