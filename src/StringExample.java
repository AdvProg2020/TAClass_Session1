import java.util.Scanner;

public class StringExample {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputLine;
        while (!(inputLine = scanner.nextLine()).equalsIgnoreCase("end"))
        {
            int pointerPosition = inputLine.indexOf("->");
            String start = inputLine.substring(0, pointerPosition);
            String end = inputLine.substring(pointerPosition + 2);
            System.out.println("calcTotalMinutes(start, end) = " + calculateDuration(start.trim(), end.trim()));
        }
    }

    private static int calculateDuration(String start, String end)
    {
        return calculateTotalMinutes(end) - calculateTotalMinutes(start);
    }

    private static int calculateTotalMinutes(String time)
    {
        int colonPosition = time.indexOf(':');
        String hour = time.substring(0, colonPosition);
        String min = time.substring(colonPosition + 1);

        return Integer.parseInt(hour) * 60 + Integer.parseInt(min);
    }
}
