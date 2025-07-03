class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

public class CinemaSchedule {
    static String[] titles = new String[100];
    static String[] times = new String[100];
    static int count = 0;

    public static void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time: " + time);
        }
        titles[count] = title;
        times[count] = time;
        count++;
    }
    public static void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " - " + times[i]);
        }
    }

    public static void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(titles[i] + " - " + times[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching movie found.");
        }
    }

    public static void generateReport() {
        System.out.println("Movie Report:");
        for (int i = 0; i < count; i++) {
            System.out.println(String.format("%d. %s - %s", i + 1, titles[i], times[i]));
        }
    }

    public static boolean isValidTime(String time) {
        int colon = time.indexOf(":");
        if (colon == -1) return false;
        try {
            int hour = Integer.parseInt(time.substring(0, colon));
            int minute = Integer.parseInt(time.substring(colon + 1));
            return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            addMovie("Avatar", "14:30");
            addMovie("Inception", "17:45");
            addMovie("Tenet", "25:00"); // Invalid time
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        displayAll();
        searchMovie("inception");
        generateReport();
    }
}
