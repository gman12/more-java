
package grades2;

import java.util.*;
import java.io.*;

public class Grades2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("grades.txt"));
        getData(input);
        System.out.println();  
        System.out.println("Program done");
    }

    public static void getData(Scanner input) {
        // Variables for calculating average grade
        int numGrades = 0;
        int totalGrade = 0;
        double avgGrade;

        // Printing out grades
        System.out.println("Grades");
        System.out.println("-------");
        int number = input.nextInt();
        System.out.println(number);

        int i = 0;
        int highGrade = 0;
        int lowGrade = 0;
        int[] grades;
        while (input.hasNextInt()) {
            grades = new int[100];          // Storing grades from file in array
            grades[i + 1] = input.nextInt();
            numGrades++;
            totalGrade += grades[i + 1];

            if (grades[i + 1] > highGrade) {      // Getting the highest grade
                highGrade = grades[i + 1];
            }

            if (grades[i + 1] < lowGrade) {       // Getting the lowest grade
                lowGrade = grades[i + 1];
            }
            i++;
        }

        avgGrade = (double) totalGrade / numGrades;  // Calculating average grade                     

        // Getting the number of grades above average
        int count = 0;
        while (input.hasNextInt()) {
            grades = new int[100];
            grades[i + 1] = input.nextInt();
            if (grades[i + 1] > avgGrade) {
                count++;
            }
            i++;
        }

        System.out.println();
        System.out.printf("The average grade is %.1f\n\n", avgGrade);
        System.out.println("The highest grade is " + highGrade);
        System.out.println();
        System.out.println("The lowest grade is " + lowGrade);
        System.out.println();
        System.out.println("The number of grades above the average is " + count);
        System.out.println();

        // Determining wheter there are any grades of zero
        if (lowGrade == 0) {
            System.out.println("There is at least one grade of zero.");
        } else {
            System.out.println("There are no grades of zero.");
        }
    }
}
