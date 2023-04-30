import java.util.Scanner;

class SearchInArray
{
   
 public static void main(String[] args) {
    

        
 //Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
   //  else print “Element not found in array”. Input the size of array, array from user and the element X from user.
     //Use Linear Search to find the element.

/*


      Scanner scan = new Scanner(System.in); 

   System.out.println("Entre the number of elements you want to add to array- ");
   int n = scan.nextInt();

   int array[] = new int[n];

   System.out.println("Entre the elements of Array- ");
   for(int i=0; i<array.length; i++)
   {
    array[i] = scan.nextInt();
   }

   System.out.println("Entre the element you want to search for- ");
   int target = scan.nextInt();

   boolean elment_found = false;

   for(int i =0; i<array.length; i++)
   {
    
    if(array[i] == target)
    {
      System.out.println("Element is present at index- " + i); 

      elment_found = true;
    }

    
   }
     if(elment_found != true)
     {
      System.out.println("Element not found");
     }

     */



     
// Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
    // not present return -1.
    // Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
    // Output 1: 6
    // Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
    // Output 2: -1 
 
/*

  // Function Defination 

  public static int lastOccurence(int array2[] , int target)
{  
  int low = 0; 
  int high = array2.length;
     int result =-1; 

     while(low <=high)
     {
      int mid = low + (high-low)/2;

      if(array2[mid] == target)
      {
        result = mid;
        low = mid+1;
      } 

      else if(array2[mid] < target)
      {
        low = mid+1;
      } 

      else 
      {
        high = mid-1;
      }
 

     }

  return result;
}
  public static void main(String[] args) {


    // Given 
    int array2[] = {1,1,1,2,3,4,4,5,6,6,6,6};
    int target =4; 
    
    // Function Calling 

    int result = lastOccurence(array2,target);

    if(result != -1)
    {
      System.out.println("Last Occurence of the element is at the index " + result);
    }
    else 
    {
        System.out.println("Target is not present in the array ");
    }
  }  


/*

  
  // Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
  // Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
  // Output 1: 6  

/*
     
  // Given 

  int array3[] = {0,0,0,0,1,1,1,1,1,1};
  
  int total_1s = 0;

  for(int i =0; i<array3.length; i++)
  {
    if(array3[i]==1)
    {
      total_1s ++;
    }
  } 
  
  System.out.println("The total number of 1's in the given array is- " + total_1s);


*/

  //   Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
// is not found in the array, report that as well.
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5
// Output: Target 5 occurs 3 times 

/*
   
  // Given 
   int nums[] = {2,5,5,5,6,6,8,9,9,9};
    int target = 5; 
    // we have to find how many times 5 is present in the array 

    int total_5s =0; 

    for(int i=0; i<nums.length; i++)
    {
      if(nums[i]==target)
      {
        total_5s ++;
      }
    } 

    if(total_5s != 0)
    {
      System.out.println("Target 5 Occures " + total_5s +" times");
    }
 */




    
// Ques 5 Given a positive integer num, return true if num is a perfect square or false otherwise.
 


/*
  // Function defination 

  public static int squreRoot(int num)
  {
    int low =0; int high = num;
    int result = -1;
    while(low<=high)
    {
      int mid = low +(high-low)/2; 
      int val = mid*mid; 

      if(val == num )
      {
        return mid; 
      } 
      else if(val>num) 
      {
        high = mid-1;
      } 
      else 
      {
        low = mid+1;
      } 
      
    } 
    return result; 
  }
    public static void main(String[] args) {
      
     Scanner scan = new Scanner(System.in); 
     
     System.out.println("Entre the number you want find the square root of- ");
     int num = scan.nextInt(); 

     // Function calling 

     int result = squreRoot(num);

     if(result != -1)
     {
      System.out.println("True - The given number is perfect square root ");
     } 

     else  
     {
      System.out.println("False - The perfect squre root of given number do not exists ");
     }

    }

 */
    }
}