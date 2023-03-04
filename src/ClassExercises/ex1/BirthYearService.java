package ClassExercises.ex1;

public class BirthYearService {
    
    public static void birthYear(int currentYear, int age) throws NegativeAgeException, InvalidAgeException {
        if (age < 0){
            throw new NegativeAgeException("NO negative age");
        }else

        if (age > 150){
            throw new InvalidAgeException("Invalid age. SORRY");
        }
    }
}
