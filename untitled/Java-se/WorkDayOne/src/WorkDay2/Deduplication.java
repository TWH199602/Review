package WorkDay2;

public class Deduplication {
  static int[] filtArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      for(int j = i+1; j < n; j++){
        if(arr[i] == arr[j]){
          for(int k = j; k < n -1; k++){
            arr[k] = arr[k+1];
          }
          n--;
          j--;
        }
      }
    }

    int[] result = new int[n];
    for(int i = 0; i < n; i++){
      result[i] = arr[i];
    }
    return  result;
  }
}
