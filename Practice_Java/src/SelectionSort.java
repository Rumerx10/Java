public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,6,7,2,1};
        int temp, min;
        for (int i=0; i<arr.length; i++){
            min = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        BubbleSort.printArray(arr); // inherited from BubbleSort class.
    }
}
