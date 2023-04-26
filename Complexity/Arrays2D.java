import java.util.Scanner;

public class Arrays2D { 

    public static void main(String[] args) {
        
        // Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
        // number of positive numbers
        // number of negative numbers
        // number of odd numbers
        // number of even numbers
        // number of 0.

        
int arr[][] = new int[4][4];

Scanner scan = new Scanner(System.in);

int positive_numbers = 0;
int negative_numbers =0;
int odd_numbers =0;
int even_numbers =0;
int zeros = 0;

for(int i =0; i<arr.length; i++)
{
  for(int j =0; j<arr[i].length; j++)
  {
    System.out.println("Entre the rows - ");
    arr[i][j] = scan.nextInt();
    
    if(arr[i][j]<0)
    {
      negative_numbers +=1;
    }

    else if(arr[i][j]>0)
    {
      positive_numbers +=1;

    }
    
    else 
    {
      zeros +=1;
    }
    
    if(arr[i][j]%2==0)
    {
      even_numbers +=1;
    }

    else
    {
      odd_numbers +=1;
    }

  }

  System.out.println();
  
  
}
scan.close();

System.out.println("Number of Even numbers is - " + even_numbers);
System.out.println("Number of odd numbers is - " + odd_numbers);
System.out.println("Number of positive numbers is- " + positive_numbers );
System.out.println("Number of Negative numbers is- " + negative_numbers);
System.out.println("Number of Zeros is- " + zeros);



// Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.




int[][] array2D = {
    { 1,  2,   3,  4,  5 },
    { 6,  7,   8,  9, 10 },
    { 11, 12, 13, 14, 15 },
    { 16, 17, 18, 19, 20 },
    { 21, 22, 23, 24, 25 }
};
//looping from first ement to second last elements
// these are above the secondary diagonal
for(int i = 0; i<array2D.length-1; i++) {
    // as i's value increase, we decrease the number of elements inculde in columns
    for(int j = 0; j<array2D.length-i-1;j++) {
        // thse elements are above the secondary diagonal
        System.out.print(array2D[i][j] + " ");
    }
}






// Ques 3 write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.



int arr1[][] = { {1,2,3},
              {4,5,6},
              {7,8,9} };
              
    for(int i = 0; i<arr1.length; i++)
    {
        for(int j =0; j<arr1[i].length; j++)
        {
          // primary diagnol 
            if(i==j)
            {
              System.out.println(arr1[i][j]);
            }

            // secondary diagnoal 
            if(i+j == arr1.length-1)
            {
              System.out.println(arr1[i][j]);
            }
        }
    }




    // Q4: Write a program to find the largest element of a given 2D array of integers.


       int arr2[][] = { {5,7,55,64},
                   {12,15,17,18},
                   {16,17,18,20},
                   {99,88,66,55} };


        int max = 0;

        for(int i =0; i<arr2.length; i++)
        {
          for(int j =0; j<arr2[i].length-1; j++)
          {
            if(arr2[i][j]>max)
            {
              max = arr2[i][j];
            }
          }
        }
        System.out.println("maximum element in the given array is - " + max);


//         Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]



int[][] array5 = {
    { 1,  2,   3,  4,  5 },
    { 6,  7,   8,  9, 10 },
    { 11, 12, 13, 14, 15 },
    { 16, 17, 18, 19, 20 },
    { 21, 22, 23, 24, 25 }
};

printMiddleElements(array5, 5);

// method is declared below




}

public static void printMiddleElements(int[][] array5, int size) {

for(int i = 0; i<array5.length; i++) {
    for(int j = 0; j<array5[i].length; j++) {
        if(array5[i][j] == array5[array5.length/2][array5.length/2]) {
            System.out.print(array5[i][j] + " ");
        } else  if(j == array5.length/2) {
            System.out.print(array5[i][j] + " ");
            
        } else if(i == array5.length/2) {
            System.out.print(array5[i][j] + " ");
        }
    }
}
    }
    
}
