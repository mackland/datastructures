import java.lang.Math;
import java.util.Arrays;

public class HelloWorld{
  // input is [1 5 3 8 2 9 7]
  public static void main(String[] args){
    int[] input = {1, 5, 3, 8, 2, 9, 7};
    MergeSort mergeSort = new MergeSort();
    int[] sortedList = mergeSort.sort(input);
    System.out.println(Arrays.toString(sortedList));
  }
}

public class MergeSort{
  public int[] sort(int[] nums){
    
    if(nums.length < 2){
    	return nums;
    }
    
    int mid = nums.length/2;
    int[] left = new int[mid];
    int[] right = new int[nums.length - mid];
    
    System.arraycopy( nums, 0, left, 0, left.length);
    System.arraycopy( nums, mid, right, 0, right.length);
    
    //sort subarrays
    sort(left);
    sort(right);
    
    int[] mergedList = merge(nums, left, right);
    
    return mergedList;

  }
  
  private int[] merge(int[] output, int[] left, int[] right){
    int dind = 0;
    int lind = 0;
    int rind = 0;
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    System.out.println(Arrays.toString(output));
    
    while( lind < left.length && rind < right.length ){
      if(left[lind] <= right[rind]){

      	output[dind++] = left[lind++]; 

      } else {

      	output[dind++] = right[rind++]; 

      }
    }
    
    while( lind<left.length){
    	output[dind++] = left[lind++]; 
    }
    while( rind<right.length){
    	output[dind++] = right[lind++]; 
    }
    return output;
  }
}