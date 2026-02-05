// Problem Statement
// Write a program to find all the possible left rotation numbers for a given integer N. Left rotation means the first digit is moved to become the last digit of the number.

// Notes:
// Even if all the digits of N are the same, they should still be considered as distinct digits while generating the possibilities.
// Ignore leading zeros while printing the possibilities.

// Input Format:
// The input contains an integer N.

// Output Format:
// The output should contain all the possible left rotation numbers of N, separated by a single white space. The numbers should be printed sequentially with an increasing number of rotations.

// Sample Input 1:
// 56743
// Sample Output 1:
// 67435 74356 43567 35674

import java.util.Scanner;
public class LeftRotate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n= sc.next();
		int len = n.length();
		for(int i=1;i<len;i++){
			String r = n.substring(i)+n.substring(0,i);
			r= r.replaceFirst("^0+","");
			System.out.print((r.isEmpty()? "0":r)+(i<len-1?" ":""));
		}
	} 
}