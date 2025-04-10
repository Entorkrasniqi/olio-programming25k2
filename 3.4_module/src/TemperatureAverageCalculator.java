import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TemperatureAverageCalculator {
    public static void main(String[] args) {
        String csvUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy H:mm:ss", Locale.getDefault());

        double sum = 0;
        int count = 0;

        try {
            URL url = new URL(csvUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip header
                }

                // Split by semicolon
                String[] parts = line.split(";");

                if (parts.length > 5) {
                    String dateTimeStr = parts[0];
                    String ulkoTaloStr = parts[5];

                    try {
                        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                        if (dateTime.toLocalDate().equals(LocalDate.of(2023, 1, 1))) {
                            double temp = Double.parseDouble(ulkoTaloStr.replace(',', '.'));
                            sum += temp;
                            count++;
                        }
                    } catch (Exception e) {
                        // Skip invalid rows
                    }
                }
            }

            reader.close();

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average 'UlkoTalo' temperature on 2023-01-01: %.2f °C%n", average);
            } else {
                System.out.println("No data for 2023-01-01.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
