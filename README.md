# Practise & Solution.

# Sorts

Bubble Sort
- If arr[i] > arr[i+1] swap them. To place the element in their respective position, we have to do the following operation N-1 times.
- Time Complexity: O(N2)

Selection Sort
 - The inner loop selects the minimum element in the unsorted array and places the elements in increasing order.
- Time complexity: O(N2)

Insertion Sort 
- Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly.
- Time Complexity: O(N2) 

Merge Sort
- It uses a recursive algorithm to achieve its results. The divide-and-conquer algorithm breaks down a big problem into smaller, 
 more manageable pieces that look similar to the initial problem. It then solves these sub-problems recursively and puts their
 solutions together to solve the original problem.
- Time Complexity: O(nlogn)

Quick Sort
- It uses 'Pivot % Parition'
- Worst case occurs when pivot is always the smallest or the largest element.
- Time Complexity: O(nlogn)