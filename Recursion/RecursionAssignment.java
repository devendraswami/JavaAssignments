import java.util.Scanner;

public class RecursionAssignment { 

    public static void main(String[] args) {

       //  Q1 : Given an integer, find out the sum of its digits using recursion. 

       Scanner scan = new Scanner(System.in); 

       System.out.println("Entre the Digit Of Which YOu want to find Sum : ");
       int num = scan.nextInt();
   
       // Function Calling 
   
       int result = sumOfDigits(num);  
       // Function is Defined Below 
   
       System.out.println("The sum is : " + result);      


    /* 
       Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
             That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
                      Constraints : 0<=n<=1e6  
    */


    int n = 5 ;  
    int sum = 0; 

    boolean isMinus = false; 

    for(int i =1 ; i<=n ; i++)
    {
       isMinus = !isMinus ;

       if(isMinus == true) 
       {
           sum += i; 
       } 
       else 
       {
          sum -= i;
       }
    }

       System.out.println("The sum of Digits is " + sum);   




     //   Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

  
     int arr[] = {13,1,-3,22,5}; 
     int max = 0; 

     for(int i =0; i<arr.length ; i++)
     {
        if(arr[i]>max)
        {
            max = arr[i];
        } 

        System.out.println("Maximum value in the Given array is : " + max);
     }

       


     
     // Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10]. 

    
     int arr2[] = {92,23,15,-20,10}; 
    
     int summ =0;

     for(int i =0 ; i<arr2.length; i++)
     {
        summ += arr2[i];
     }
     
     System.out.println("Sum of the Digits of Given array is : " + summ);



     
      /*  Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy) */

 int n1 = 153 ;  
 int nToCompare = n1; 
 
 String str = Integer.toString(n1); 
 
 // Calculate the number of Digits in the number 

 int numOfDigits = str.length();  

 int sum2 = 0; 

 

 while(n1>0)
 {
    int a = n1%10; 
    
    
    // Function Calling  // Function Defenition is Given below 
    int result5 = powerFind(a, numOfDigits);  
    
    sum2 += result5;
    n1 = n1/10;  
    
 }  

 if(nToCompare == sum2)
 {
   System.out.println("Given number is an armStrong");

 } 

else 
{
   System.out.println("Given number is not an ArmStrong ");
}

   

    }  






    // Function Defination of Question 1 
   public static int sumOfDigits(int num)
   {
      int sum = 0;  

      if(num == 0)
      {
         return 0; 
      } 
      else 
      {
         sum = num%10 + sumOfDigits(num/10); 
      }

      return sum; 
   }   
    



   // Function Defenation of Question number 5 

   public static int powerFind(int a , int b )
   {
    int result = 0;  
    
    if(b==0)
    {
        return 1 ; 
    } 
    else 
    {
        result = a*powerFind(a, b-1);
    }

    return result; 
   }
}
