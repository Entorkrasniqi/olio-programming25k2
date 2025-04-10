import java.io.*;
import java.net.*;
import java.util.*;

public class TemperatureAverageCalculator {
    public static void main(String[] args) {
        // first, create the URL
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            // open the connection and get the input stream
            InputStream istream = myUrl.openStream();

            // jump to character streams
            InputStreamReader istreamreader = new InputStreamReader(istream);

            // and to buffered reader for efficiency
            BufferedReader reader = new BufferedReader(istreamreader);

            // Initialize variables to store the data
            String line;
            List<Double> temperatures = new ArrayList<>();
            boolean isHeader = true;
            String[] headers = null;

            // Read the content line by line
            while ((line = reader.readLine()) != null) {
                // Skip the header row and parse the data rows
                if (isHeader) {
                    headers = line.split(",");
                    isHeader = false;
                    continue;
                }

                String[] values = line.split(",");

                String date = values[0].trim(); // Assuming date is the first column
                String location = values[1].trim(); // Assuming 'UlkoTalo' is the second column
                String temperatureStr = values[2].trim(); // Assuming temperature is the third column

                // Check if the date matches January 1st, 2023 and the location is "UlkoTalo"
                if (date.equals("2023-01-01") && location.equals("UlkoTalo")) {
                    try {
                        // Parse the temperature value and add it to the list
                        double temperature = Double.parseDouble(temperatureStr);
                        temperatures.add(temperature);
                    } catch (NumberFormatException e) {
                        // Skip invalid temperature data
                        System.err.println("Invalid temperature data: " + temperatureStr);
                    }
                }
            }

            // Calculate the average temperature for all "UlkoTalo" entries on January 1st, 2023
            if (!temperatures.isEmpty()) {
                double sum = 0;
                for (double temp : temperatures) {
                    sum += temp;
                }
                double average = sum / temperatures.size();
                System.out.println("Average temperature on January 1st, 2023 for UlkoTalo: " + average);
            } else {
                System.out.println("No data found for January 1st, 2023 in UlkoTalo.");
            }

            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
