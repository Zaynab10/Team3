import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

                break;

            case 2: // Check palindrome
            	CheckPalindrome(stringArr);
                break;

            case 3: // Sort

                break;

            case 4: // Check Sorted

                break;

            case 5: // Get the maximum 3 numbers

                break;

            case 6: // Most repeated value

                break;

            case 7: // Get median
            	GetMedian(intArr);
                break;

            case 8: // Shuffle

                break;

            case 9: // Find smallest prime

                break;

            case 10: // Get the minimum 3 numbers

                break;

            case 11: // Distnict Array

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
		Get_Average(intArr);
                break;

            case 18: //execute all
            	CheckPalindrome(stringArr);
            	GetMedian(intArr);
            	returnOnlyPrime(intArr);
		Get_Average(intArr);
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
	static void GetMedian(ArrayList<Integer> arr)
	{//Ahmed Bassem 20160008
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

	public static void Get_Average(ArrayList<Integer> input)
	{
		// Abanoub Maged
		// 20160002

		int sum = 0;
		int avg = 0;

		for(int i=0; i<input.size(); i++)
		{
			sum = sum + input.get(i);
		}
		
		avg = sum/input.size();

		System.out.println("The Average = " + avg);
	}	
	
}