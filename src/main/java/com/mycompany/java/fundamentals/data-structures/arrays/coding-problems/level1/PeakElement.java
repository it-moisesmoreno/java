package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Given an array arr[] of integers. Find a peak element i.e. an element that is
 * not smaller than its neighbors.  *
 * Example:
 *
 * Input: array[]= {5, 10, 20, 15} Output: 20 Explanation: The element 20 has
 * neighbors 10 and 15, both of them are less than 20.
 *
 * Input: array[] = {10, 20, 15, 2, 23, 90, 67} Output: 20 or 90 Explanation:
 * The element 20 has neighbors 10 and 15, both of them are less than 20,
 * similarly 90 has neighbors 23 and 67.
 *
 * The findPeakElement method uses a binary search approach to find a peak
 * element in the given array. It starts by finding the middle element of the
 * array, and then compares it with its adjacent elements to determine if it's a
 * peak element. If not, it moves towards the direction of the greater adjacent
 * element until a peak element is found or the search space is exhausted. The
 * time complexity of this approach is O(log n), where n is the size of the
 * array.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class PeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            } // If arr[mid+1] is greater, move to right
            else if (mid < n - 1 && arr[mid + 1] > arr[mid]) {
                left = mid + 1;
            } // If arr[mid-1] is greater, move to left
            else {
                right = mid - 1;
            }
        }

        // No peak element found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 20, 15};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};

        System.out.println("Peak element in arr1: " + findPeakElement(arr1));
        System.out.println("Peak element in arr2: " + findPeakElement(arr2));
    }
}
