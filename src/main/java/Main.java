public class Main {

    public static void main(String args[]) {
        int arr[] = {3, -1, -4, 1, 5, 9, -2, 6, -5, 3, -5};
        int n = 11;
        selSort(arr, n);
        System.out.print(arr);
    }

    /// sorting by selection
    public static void selSort(int arr[], int n) {
        if (n <= 1)
            return;
        int min;
       for(int i=0; i<n-1; i++)
       {
            min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min])
                    min = j;
            }
            if(arr[min] < arr[i]) {
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

       }

    }
}
