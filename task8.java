//Date and Time Validation: Write a program that validates user input for dates and times.
//Ensure the input is in a specific format and represents a valid date/time within a
//certain range (e.g., check for future dates only).


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class task8 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java DateTimeValidator <datetime>");
            return;
        }

        String inputDateTimeStr = args[0];

        // Define the expected date/time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            // Parse the input string to LocalDateTime using the defined format
            LocalDateTime inputDateTime = LocalDateTime.parse(inputDateTimeStr, formatter);

            // Get the current date/time
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Validate if the input date/time is in the future
            if (inputDateTime.isAfter(currentDateTime)) {
                System.out.println("Input date/time is valid and represents a future date/time.");
            } else {
                System.out.println("Input date/time must be in the future.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date/time format. Please use the format 'yyyy-MM-dd HH:mm:ss'.");
        }
    }
}