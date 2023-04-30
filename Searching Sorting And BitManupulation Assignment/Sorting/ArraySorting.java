
import java.util.Arrays;
class ArraySorting
{
    
 //Ques1. Write a program to sort an array in descending order using bubble sort.
  //      Input Array {3,5,1,6,0}
  //      Output Array: {6, 5, 3, 1, 0}

/*
         // Function Defination 

  public static void bubbleSort(int array1[])
  {  
    boolean swapped = false;
    for(int i=0; i<array1.length; i++)
    {
      
       for(int j=0; j<array1.length-i-1; j++)
       {
        if(array1[j+1] > array1[j])
        {
          // Swapping 
           int temp = array1[j+1];
           array1[j+1] = array1[j];
           array1[j] = temp;
           swapped = true;
        }
        if(!swapped)
        {
          break;
        }
       }
    }
     
  }
  public static void main(String[] args) {
    
    int array1[] = {3,5,1,6,0};
   
    // Function Calling 
    bubbleSort(array1);
    System.out.println("Sorted Array is- ");
    System.out.println(Arrays.toString(array1));


  }

*/


//   Q2. WAP to sort an array in descending order using selection sort
//           Input Array {3,5,1,6,0}
//           Output Array: {6, 5, 3, 1, 0}



/*
          
  public static void selectionSort(int array2[])
  {
    for(int i =0; i<array2.length; i++)
    {
      int max_index = i;
      for(int j=i+1; j<array2.length; j++)
      {
        if(array2[j] > array2[max_index])
        {
          max_index = j;
        }
      } 
      if(max_index != i)
      {
        int temp = array2[max_index];
        array2[max_index] = array2[i];
        array2[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    
    int array2[] = {3,5,1,6,0};

    // Function calling 
     selectionSort(array2);

     System.out.println("Sorted array is- ");
     System.out.println(Arrays.toString(array2));
  }

*/


//   Q3. WAP to sort an array in decreasing order using insertion sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0} 


 /*   
// Function Defination 

public static void insertionSort(int arr[])
{
    for(int i=1; i<arr.length; i++)
    {
        int j=i;
        while(j>0 && arr[j]<arr[j-1])
        {
            
                // swap 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
           
        }
    }
}

    public static void main(String[] args) {
        
        int arr[] = {3,5,1,6,0};

        // function calling 

        insertionSort(arr);

        System.out.println("Sorted array is - ");
        System.out.println(Arrays.toString(arr));
    }

 */

/*

Q4. Find out how many pass would be required to sort the following array in decreasing order
using bubble sort
Input Array {3,5,1,6,0}

Answer-   3 pass would be required to sort this array in decreasinf order. 
        
          Pass1 : {5,3,6,1,0}
          Pass2 : {5,6,3,1,0}
          Pass3 : {6,5,3,1,0}


Q5. Find out the number of iterations to sort the array in descending order using selection sort.
Input Array {3,5,1,6,0} 

Answer-  

 The number of iteration is 2 to sort the array in descending order using selection sort.



*/

}