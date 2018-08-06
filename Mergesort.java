public class Mergesort{
    public static void mergesort(int[] array){
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length-1);
    }

    public static void mergesort(int[] arr, int[] helper, int low, int high){
        if(low < high){
            int middle = (high - low)/2 + low;
            mergesort(arr, helper, low, middle);
            mergesort(arr, helper, middle+1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    public static void merge(int[] arr, int[] helper, int low, int middle, int high){
        for(int i = low; i <= high; i++){
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while(helperLeft <= middle && helperRight <= high){
            if(helper[helperLeft] <= helper[helperRight]){
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remainder = middle - helperLeft;
        for(int i = 0; i <= remainder; i++){
            arr[current + i] = helper[helperLeft+i];
        }
    }

    public static void main(String args[]){
        int[] arr = {2,7,4,8,3,6};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        mergesort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }   
    }
}
