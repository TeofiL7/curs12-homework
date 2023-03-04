package ClassExercises.ex1;

import java.util.Calendar;
import java.util.Scanner;

public class BirthYearCalculator {
    public static void main(String[] args){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear, age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your age");
        age = scanner.nextInt();
        System.out.println("Your birth year is: ");
        System.out.println(birthYear = currentYear - age);

        try {
            BirthYearService.birthYear(currentYear, age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        }
    }
}
