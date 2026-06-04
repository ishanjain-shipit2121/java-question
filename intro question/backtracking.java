public class backtracking {
  public static void changeArr( int arr[], int i, int val) {
    if(i == arr.length){
  printArr(arr);
  return;
    }

    arr[i] = val;
    changeArr( arr, i+1, val);
    arr[i] = arr[i] + 4;

  } 

  public static void printArr(int arr[]) {
    for(int i =0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

public static void main(String args[]) {
  int arr[] = new int[5];
  changeArr(arr, 3, 34);
  printArr(arr);
}
}