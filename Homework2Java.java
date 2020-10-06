/*Write a Java code that : Has 5 variables (grade1~grade5) as 5 grades of a student
 * 
grade1= 91.14, grade2= 85.01, grade3= 72, grade4= 63, grade5= 81.14

Find the average of the grades.
Use switch and if to:
If the final average grade is more than 90.00 and less than 100 it prints “A: Fantastic job!”
If it is between 80 to 89.99, it prints: “B: Good!”
If it is between 70 to 79.99, it prints “C: Please try more next time!”
If it is 69.99 or less, it prints “F: Unfortunately you failed!”*/

import java.util.Scanner;
public class Homework2Java {
	public static void main(String[] args)
	{
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		double grade1 = 91.14;
		double grade2 = 85.01;
		double grade3 = 72;
		double grade4 = 63;
		double grade5 = 81.14;
		double average;
		
		average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
		
		if( average < 69.99) {
			System.out.printf("F: Unfortunately you failed!", average);
		}else if( average < 79.99) {
			System.out.printf("C: Please try more next time!", average);
		}else if( average < 89.99) {
			System.out.printf("B: Good!", average);
		}else if( average < 100) {
			System.out.printf("A: Fantastic job!", average);
		}		
	}//End of main
}