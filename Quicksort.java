public class Quicksort{
    public void quickSort(int[] arr, int left, int right){
        int index = partition(arr, left, right);
        if(left < index - 1) {
            quickSort(arr, left, index-1);
        } else if (right > index){
            quickSort(arr, index, right);
        }

    }
    
    //return position of the pivot after swap
    public int partition(int[] arr, int left, int right){
        int pivot = arr[(left + right)/2];
        while(left <= right){
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            
            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(arr, left, right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
