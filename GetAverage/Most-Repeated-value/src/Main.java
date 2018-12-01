import java.util.Arrays;

public class Main {

    static void most_Repeated_Value(int arr[])
    {
        // Name : Islam Ibrahim Amin
        // ID   : 20160320

        Arrays.sort(arr);
        int n = arr.length;
        int max_count = 1, result = arr[0];
        int current_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                current_count++;
            else {
                if (current_count > max_count) {
                    max_count = current_count;
                    result = arr[i - 1];
                }
                current_count = 1;
            }
        }
        System.out.printf("most repeated Value is : %d\n", result);
        System.out.printf("Repeated times is : %d\n",max_count);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 10, 0, 40, 50, 40};
        most_Repeated_Value(arr);
    }
}
