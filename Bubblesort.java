public class Bubblesort{
    public int[] sort(int[] array){
        int temp;

        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[j - 1] > array[j]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args){
        Bubblesort bs = new Bubblesort();

        int[] unsorted = {3, 5, 7, 15, 1, 9};
        
        for(int i = 0; i < unsorted.length; i++){
            System.out.println(unsorted[i]);
        }

        int[] sorted = bs.sort(unsorted);

        for(int i = 0; i < unsorted.length; i++){
            System.out.println(sorted[i]);
        }
    }

}
