import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] arr ={1,4,3,6,2,5};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr){
    for(int i=0; i < arr.length; i++){
      int last = arr.length -i - 1; // 5
      int max = findMax(arr,0,last); 
      int temp = arr[max];
      arr[max] = arr[last];
      arr[last] = temp;
    }
  }
  static int findMax(int[] arr, int first, int last){
    int max = first;
    for(int i = first; i <= last; i++){
      if(arr[max] < arr[i]){
        max = i;
      }
    }
    return max;
  }
}