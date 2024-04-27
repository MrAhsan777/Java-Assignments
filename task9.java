//Holiday Calendar: Create a program that reads a year from the user and displays a list of major holidays
//(e.g., New Year's Day, Christmas) for that year using
//the LocalDate API and predefined holiday data structures.
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class task9 {
    public static void main(String[] args) {
        // Read the year from the user input
        int year = 2024; // Replace with user input or any default year
        // You can prompt the user for input using Scanner class if needed

        // Define a map to store the major holidays with their dates
        Map<String, LocalDate> holidays = new HashMap<>();

        // Populate the map with major holidays
        holidays.put("New Year's Day", LocalDate.of(year, 1, 1));
        holidays.put("Valentine's Day", LocalDate.of(year, 2, 14));
        holidays.put("St. Patrick's Day", LocalDate.of(year, 3, 17));
        holidays.put("Easter Sunday", calculateEasterSunday(year));
        holidays.put("Independence Day", LocalDate.of(year, 7, 4));
        holidays.put("Halloween", LocalDate.of(year, 10, 31));
        holidays.put("Thanksgiving Day", calculateThanksgivingDay(year));
        holidays.put("Christmas Day", LocalDate.of(year, 12, 25));

        // Display the list of holidays for the given year
        System.out.println("Major holidays for the year " + year + ":");
        for (Map.Entry<String, LocalDate> entry : holidays.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to calculate Easter Sunday date for a given year (using Gauss's algorithm)
    private static LocalDate calculateEasterSunday(int year) {
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
        return LocalDate.of(year, month, day);
    }

    // Method to calculate Thanksgiving Day date for a given year (fourth Thursday of November)
    private static LocalDate calculateThanksgivingDay(int year) {
        LocalDate thanksgivingDay = LocalDate.of(year, 11, 1);
        int daysToAdd = (3 - thanksgivingDay.getDayOfWeek().getValue() + 7) % 7 + (3 * 7);
        return thanksgivingDay.plusDays(daysToAdd);
    }
}