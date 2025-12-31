// package com.skillnext;

// import java.util.Scanner;

// public class App 
// {
//     public static boolean check_prime(int n)
//     {
//         if (n <= 1)
//             return false;

//         for (int i = 2; i <= Math.sqrt(n); i++)
//         {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int n = sc.nextInt();

//         if (check_prime(n))
//             System.out.println("Num = " + n + " is prime");
//         else
//             System.out.println("Num = " + n + " is NOT prime");

//         sc.close();
//     }
// }

package com.su2;

import java.util.Arrays;
import java.util.Scanner;

public class App1 {

    public static void checkPrime(int n, int m) {

        boolean[] arr = new boolean[m + 1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= m; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= m; j += i) {
                    arr[j] = false;
                }
            }
        }

        System.out.println("Prime numbers:");
        for (int i = n; i <= m; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int n = sc.nextInt();

        System.out.println("Enter ending number:");
        int m = sc.nextInt();

        checkPrime(n, m);
    }
}