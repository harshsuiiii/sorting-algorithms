public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Variable to track if any swap occurred in a pass
        boolean swapped;

        for (int i = 0; i < n; i++) {
            // If no swaps occur in a pass, array is sorted
            if (!swapped) {
                break;
            }
            
            // Set swapped to false at the beginning of each pass
            swapped = false;
            
            // Last i elements are already in place, so no need to check them
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next one
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Set swapped to true indicating a swap occurred
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

