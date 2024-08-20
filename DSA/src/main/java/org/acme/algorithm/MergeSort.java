package org.acme.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
  //index element count
  // 0.1.2.3.4.5
  //first = 2 last = 5
  // where is mid?
  // first + (last-first)/ 2 = mid
  // 2+(5-2)/2 = 3
  public static void divide(int arr[], int first_i, int last_i) {
    //baseCase first Index Better then Lsat Index to close
    if (first_i >= last_i) {
      return;
    }

// {0.1.2.3.4 /.5.6.7.8.9}   0~4 5~9
    int middle_i = first_i + (last_i - first_i) / 2;

    divide(arr, first_i, middle_i);
    // first=0 , last=4
    divide(arr, middle_i + 1, last_i);
    // first= middle = 5 = 4+1 , last = 9

    couquer(arr ,first_i,middle_i,last_i );

  }

  private static void couquer(int[] arr, int firstI, int middleI, int lastI) {
    int[] merged = new int[lastI - firstI + 1];


  }

  List<String> arr = new ArrayList<>();

  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 8, 26, 66, 7, 12};
    int n = arr.length;

    System.out.println("merge sort" + arr.toString());
  }
}
