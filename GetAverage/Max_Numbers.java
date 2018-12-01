/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MOHAMED
 */

public class Max_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void MAX_Numbers()
    {
        Scanner input = new Scanner(System.in);
        int arr_size;
        System.out.println("Please Enter size of array :");
        arr_size = input.nextInt();
        int [] my_array = new int[arr_size];
        int Max_num;
        //ArrayList <Integer> Maximum_num = new ArrayList();
        System.out.println("Please Enter Elements of the array :");
        for(int i=0 ; i<arr_size ; i++)
        {
            System.out.println("Please Enter Elements number "+(i+1));
            my_array[i] = input.nextInt();
        }
        Arrays.sort(my_array);
        System.out.println("The three Maximam numbers in the Array :");
        for(int j=arr_size-1 ; j>arr_size-4 ; j--)
        {
            System.out.print(my_array[j]+"   ");
        }
        System.out.println("");}
    public static void most_Repeated_Value(int arr[])
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
        // TODO code application logic here
        int arr[] = {10, 20, 40, 10, 0, 40, 50, 40};
        most_Repeated_Value(arr);

        MAX_Numbers();
        
        
    }
    
}
