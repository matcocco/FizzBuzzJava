/*
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
 */

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input a number you wish to solve for multiples of 3 and 5");
		int max = sc.nextInt();


		for (int i = 1; i <= max; i++){
			if (i%3 == 0){
				System.out.print("fizz");
			}

			if (i%5 == 0){
				System.out.print("buzz");

			}
			if (i%3 != 0 && i%5 != 0){
				System.out.print(i);
			}
			System.out.println("");

		}
	}
}
