import java.util.Arrays;

class Assignment_1DArray
{
    public static void main(String[] args) {
    


     //   Question 1. Write a program to print the sum of all the elements present on the even indices in the given array. 
        


        int arr[] = {3,20,4,6,9};
        
         int sum = 0;

         for(int i =0; i<arr.length; i++)
         {
           if(i%2==0)
           {
               sum += arr[i];
   
           }
         }
         System.out.println("Sum of all the elements present on the even indeces - "+sum);


// Que2  Write a program to transverse over the elements of the array using the for each loop and print all the 
 //    elements on the even indeces. 
      

       int arr2[] = {34,21,54,65,43};

        for (int i : arr2) {
         if(i%2==0)
        {
             System.out.print(i);
             System.out.print(",");
        }
     }

       System.out.println();



//Ques3 Write a program to find the maximum element in the given array. 


int arr3[] = {34,21,54,65,43};

int max =0; 

for (int i : arr3) {
  if(i>max)
  {
   max = i;
  }
}
System.out.println("Maximum element in the array is- " + max);


//Ques4  Write a program to find out the second largest element in the given array. 

  
int arr4[] = {34,21,54,65,43};

Arrays.sort(arr4);
 
System.out.println( "Second largest element in the Array is- "+arr4[arr4.length-2]);





//Ques5 Write a program to find the first peak element of the given array. 

int arr5[] = {1,3,2,6,5};

for(int i=0; i<arr5.length-2; i++)
{
if(arr5[i]<arr5[i+1])
{
 if(arr5[i+1] > arr5[i+2])
 {
   System.out.println("The first Peak element is - " + arr5[i+1]);
   break;
 }
}  
   
}


    }
}