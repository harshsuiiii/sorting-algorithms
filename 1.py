def bubble_sort(arr):
    n = len(arr)
    
    swapped = True

    for i in range(n):
        
        if not swapped:
            break
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True

arr = [64, 25, 12, 22, 11]
bubble_sort(arr)
print("Sorted array:")
print(arr)
