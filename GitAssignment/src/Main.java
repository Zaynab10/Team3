
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;

public class Main {

    private static String[] stringArr;
    private static ArrayList<Integer> intArr = new ArrayList<>();
    public static void main(String[] args) {
        System.out.print("Enter characters array size: ");
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        stringArr = new String[siz];
        	
        System.out.println("Enter characters array elements:");
        	for(int i=0;i<siz;i++)
        		stringArr[i] = sc.next();

        	
        System.out.print("Enter integers array size: ");
        siz = sc.nextInt();        
        System.out.println("Enter integers array elements:");
        	for(int i=0;i<siz;i++)
        		intArr.add(sc.nextInt());

    	
        printMenu();
        int choice = sc.nextInt();
        sc.close();
        switch (choice){
            case 1: // Reverse Array
		reverse(intArr);
                break;

            case 2: // Check palindrome
            	CheckPalindrome(stringArr);
                break;

            case 3: // Sort

                break;

            case 4: // Check Sorted
			    boolean b= Check_Sorted(intArr,siz);
                if(b) System.out.println("Array is sorted.");
                else System.out.println("Array is not sorted.");
                
				break;

            case 5: // Get the maximum 3 numbers

                break;

            case 6: // Most repeated value
                most_Repeated_Value(convertIntegers(intArr));
                break;

            case 7: // Get median
            	GetMedian(intArr);
                break;

            case 8: // Shuffle

                break;

            case 9: // Find smallest prime
            	find_Smallest_Prime(intArr);
                break;

            case 10: // Get the minimum 3 numbers
		Get_Min_3(stringArr);
                break;

            case 11: // Distnict Array
		DisntinctArray(intArr);
                break;

            case 12: // Zero if less than zero

                break;

            case 13: // Count primes

                break;

            case 14: // Return only primes
            	returnOnlyPrime(intArr);
                break;

            case 15: // Find Largest Prime

                break;

            case 16: // Shift Array

                break;

            case 17: // Get Average

                break;

            case 18: //execute all
		reverse(intArr);
            	CheckPalindrome(stringArr);
            	GetMedian(intArr);
            	returnOnlyPrime(intArr);
            	find_Smallest_Prime(intArr);
                most_Repeated_Value(convertIntegers(intArr));
		DisntinctArray(intArr);
		Get_Min_3(stringArr);
                break;
        }

    }

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tReverse Array");
        System.out.println("2-\tCheck palindrome");
        System.out.println("3-\tSort");
        System.out.println("4-\tCheck Sorted");
        System.out.println("5-\tGet the maximum 3 numbers");
        System.out.println("6-\tMost repeated value");
        System.out.println("7-\tGet median");
        System.out.println("8-\tShuffle");
        System.out.println("9-\tFind smallest prime");
        System.out.println("10-\tGet the minimum 3 numbers");
        System.out.println("11-\tDistnict Array");
        System.out.println("12-\tZero if less than zero");
        System.out.println("13-\tCount primes");
        System.out.println("14-\tReturn only primes");
        System.out.println("15-\tFind Largest Prime");
        System.out.println("16-\tShift Array");
        System.out.println("17-\tGet Average");
        System.out.println("18-\tExecute All");

    }
	
	/***************/
		/*20160065*/
    public static boolean Check_Sorted(ArrayList<Integer> Arr,int siz){

        for(int i=0;i<siz-1;i++)
        {
            if(Arr.get(i)> Arr.get(i + 1)) return false;

        }
        return true;
    }
	
  /**************/
  
    public static void CheckPalindrome(String arr[])  
    {  

        String[] reverse = new String[arr.length];
        
        for(int i = 0; i < arr.length; i++)
        {
	        reverse[i] = arr[arr.length - i - 1];
        }
	    Boolean isPal = Arrays.toString(arr).equals(Arrays.toString(reverse));
	    	
	    if (isPal)  
	        System.out.println("Entered string is a palindrome.");  
	    else  
	        System.out.println("Entered string isn't a palindrome.");   
    }  
    
    
    
    
    
    /**
	 * 20160115
	 * @param n the number to check if it's prime or not
	 * @return true if the nummber is prime
	 */
	public static Boolean isPrime(int n)
	{
		if(n%2 == 0)
        {
            return false;
        }
        for(int i = 3; i <= Math.floor(Math.sqrt(n)); i+=2)
        {
          if(n % i == 0)
          {
              return false;
          }
        }
        return true;
	}
	public static void GetMedian(ArrayList<Integer> arr)
	{//20160008 Ahmed Bassem
		Collections.sort(arr);
		int size=arr.size()-1;
		int median=0;
		if(arr.size()%2!=0)
		{
			median=arr.get(size/2);
		}
		else
		{
			int m1=arr.get((size/2)+1);
			int m2=arr.get(size/2);
			median=(m1+m2)/2;
		}
		System.out.println("Median = " + median);
	}
	
	/**
	 * 20160115
	 * @param orig the original array
	 * @return another contains only the prime numbers in the original array
	 */
	public static ArrayList<Integer> returnOnlyPrime(ArrayList<Integer>  orig)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i:orig)
		{
			if(isPrime(i))
				arr.add(i);
		}
		System.out.println(arr);
		return arr;
	}
	/**
	 * 20160242
	 * @param intArr2 the original array
	 * @return the smallest Prime number in the orignal array
	 */
	
	 public static int find_Smallest_Prime(ArrayList<Integer> intArr2)
	    {
	        int smallest_value=99999;
	        boolean cheak,thereis=false; 
	        for(int i=0;i<intArr2.size();i++)
	        {
	            
	            if(isPrime(intArr2.get(i))&&smallest_value>intArr2.get(i))
	            {
	                smallest_value=intArr2.get(i);
	                thereis=true;
	            } 
	        }
	        if(thereis)
	        {
	        	System.out.println(smallest_value);
	            return smallest_value;
	        }
	            else
	            {
	            	System.out.println("There is no Prime numbers in this array");
	                return -1;
	            }
	    }

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
        // System.out.printf("Repeated times is : %d\n",max_count);
    }
    public static int[] convertIntegers( ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
	
	public static void DisntinctArray(ArrayList<Integer> array) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < array.size(); i++) {
			boolean isUnique = false;
			for(int j = 0; j < i; j++) {
				if(array.get(i) == array.get(j)) {
					isUnique = true;
					break;
				}
			}
			if(!isUnique) {
				arr.add(array.get(i));
			}
		}
		for(int i = 0; i < arr.size(); i++) 
    		System.out.println(arr.get(i));
	}
	public  static void Get_Min_3(String  array[])
	{	
		///Name:Youssef Ahmed Ali
		//ID:20160292
		///Supposed to call the Sort function
		String minarray[];
		minarray=new String[Math.min(3,array.length)];
		////Sort
		Arrays.sort(array);
		////////////
		///Get the minimum 3
		
		for(int i=0;i<3 && i<array.length;i++)
		{
			minarray[i]=array[i];
		}
		System.out.println("The Smallest 3 values are : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	static void reverse ( ArrayList arr){
        ArrayList arr2 = new ArrayList<>();
        for(int i = 0 ; i < arr.size() ; i++ )
            arr2.add(arr.get(i));
        for(int i = 1 ; i <= arr.size() ; i++ )
            arr.set(i-1, (int) arr2.get(arr.size()-i));
    }
}
