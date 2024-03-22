/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    
   public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15}; // Example sorted array
        int key = 7; // Key to search for

        // Call binary search method
        int index = BinarySearch.runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);

        // Display result
        if (index != Integer.MAX_VALUE) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
   }
