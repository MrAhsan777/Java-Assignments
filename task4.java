import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String date = in.nextLine();

        try{
            LocalDate parsedDate = LocalDate.parse(date, dtf);
            System.out.println("CORRECT !! ur date: " + parsedDate);

        }
        catch(DateTimeParseException e){
            System.out.println(" WRONG 🙂 Your date: " + date);
            System.out.println("U should input in dd/MM/yyyy <<<<<< THIS FORMAT 🥲");

        }


    }
}