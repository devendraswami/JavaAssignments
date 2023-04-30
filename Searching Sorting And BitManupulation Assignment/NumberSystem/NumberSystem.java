import java.util.Scanner;

class NumberSystem 
{
     public static void main(String[] args) {
        
         // Problem 1: given a number, print its binary representation. [easy]
        // Input 1: number = 5
        // Output 1: 101 



        Scanner scan = new Scanner(System.in);

        System.out.println("Entre the number you want to print the binary represation of- "); 
        int number = scan.nextInt();
        
         String num = Integer.toBinaryString(number);
         System.out.println("The binary represation of entred number is - " + num);




        //  Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
        //             Input 1: n = 15
        //             Output 1: False
        //             Input 2: n = 32
        //             Output 2: True



                     
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if ((n & (n - 1)) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }





        // Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
        // Input 8, Even
        // 3, False


        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = input2.nextInt();

        if ((n1 & 1) == 0) {
            System.out.println(n1 + " is Even");
        } else {
            System.out.println(n1 + " is Odd");
        }


        // Q4. Given a number, count the number of set bits in that number without using an extra space.
        //       Note : bit ‘1’ is also known as set bit. 

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n2 = input3.nextInt();
        int count = 0;

        while (n2 != 0) {
            if ((n2 & 1) == 1) {
                count++;
            }
            n2 = n2 >>> 1; // Unsigned right shift by 1
        }

        System.out.println("Number of set bits in " + n2 + " is " + count);





        // Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
        //     number of times except one which appears an odd number of times. Find that odd appearing
        //     element in linear time and without using any extra memory.
        //      For example,
        //      Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
        //      Output : The odd occurring element is 4. 


        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n5 = input4.nextInt();
        int[] arr = new int[n5];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n5; i++) {
            arr[i] = input4.nextInt();
        }

        int result = arr[0];
        for (int i = 1; i < n5; i++) {
            result ^= arr[i];
        }

        System.out.println("The odd occurring element is " + result);


     }
}