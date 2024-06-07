public class Node {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 2;
        int result = binarySearch(numbers, target);
        if (result != -1) {
           System.out.println("Found target at index " + result);
        } else {
          System.out.println("Target not found");
      }
   }
}

