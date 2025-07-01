import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        scanner.close();

        String apiKey = "2844dd5bd4ee9fa2e6235fb9a1129785"; // 👉 Replace with your real OpenWeather API key
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JSONObject obj = new JSONObject(content.toString());
            String weather = obj.getJSONArray("weather").getJSONObject(0).getString("main");
            String description = obj.getJSONArray("weather").getJSONObject(0).getString("description");
            double temp = obj.getJSONObject("main").getDouble("temp");
            int humidity = obj.getJSONObject("main").getInt("humidity");
            double wind = obj.getJSONObject("wind").getDouble("speed");

            String report = "\n--- Weather Report for " + city + " ---\n"
                          + "Weather     : " + weather + " (" + description + ")\n"
                          + "Temperature : " + temp + " °C\n"
                          + "Humidity    : " + humidity + " %\n"
                          + "Wind Speed  : " + wind + " m/s\n";

            // Show on screen
            System.out.println(report);

            // Save to file
            try (FileWriter writer = new FileWriter("weather.txt", true)) {
                writer.write(report);
                writer.write("\n"); // new line for next report
                System.out.println("✅ Weather report saved to weatherapp.txt");
            } catch (Exception e) {
                System.out.println("❌ Could not save file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
