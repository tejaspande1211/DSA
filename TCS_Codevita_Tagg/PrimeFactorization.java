// Problem Statement
// Write a program to find the prime factorization of a given positive integer N. The program should decompose N into its prime factors and display them in ascending order.
// Prime factorization is the process of breaking down a composite number into the product of its prime factors. For example, 12 = 2 × 2 × 3, so the prime factors are [2, 2, 3].

// Note:
// The prime factors should be listed in ascending order.
// If a prime factor appears multiple times, it should be listed that many times.
// If N is a prime number itself, the output will contain only that number.

// Input Format:
// The input contains a single positive integer N.
// Output Format:
// The output should contain all the prime factors of N separated by a single space, printed in ascending order.

// Sample Input 1:
// 1500
// Sample Output 1:
// 2 2 3 5 5 5

import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n%2==0){
            System.out.print(2+" ");
            n = n/2;
        }
        for(long i = 3;i*i <=n;i=i+2){
            while(n%i ==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
}
