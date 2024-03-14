function bubbleSort(arr) {
    const n = arr.length;
    // Variable to track if any swap occurred in a pass
    let swapped;

    for (let i = 0; i < n; i++) {
        // If no swaps occur in a pass, array is sorted
        if (!swapped) {
            break;
        }
        
        // Set swapped to false at the beginning of each pass
        swapped = false;
        
        // Last i elements are already in place, so no need to check them
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap if the current element is greater than the next one
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                // Set swapped to true indicating a swap occurred
                swapped = true;
            }
        }
    }
}

// Example usage:
const arr = [64, 25, 12, 22, 11];
bubbleSort(arr);
console.log("Sorted array:");
console.log(arr);
