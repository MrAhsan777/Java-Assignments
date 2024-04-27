import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class assi1{
    public static void main(String[] args){
        System.out.println("\t\t\t program for findin diff bw two dates 📅 ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st date yyyy-mm-dd : ");
        LocalDate d1 = LocalDate.parse(in.nextLine());
        System.out.print("Enter the 2nd date: ");
        LocalDate d2 = LocalDate.parse(in.nextLine());

        Period Diff = Period.between(d1, d2);

        System.out.println("\t\t\t\t The difference between is  " + Diff);
        System.out.print("Ignore the p its just the abjbrivation of p ");

    }

}