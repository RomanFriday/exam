public class Main {

    public static void main(String args[]) {
        int arr[] = {3, -1, -4, 1, 5, 9, -2, 6, -5, 3, -5};
        int n = 11;
        bubble(arr, n);
        System.out.print(arr);
    }

    /// bubble-sorting
    public static void bubble(int arr[], int n) {
        if (n <= 1)
            return;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j <n - i -1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
