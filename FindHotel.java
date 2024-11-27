package Buffer;

import java.net.URI;
import java.net.http.*;
import java.util.Scanner;

public class FindHotel {
    public static void main(String[] args) {
        try {
            // Accept city input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter city name: ");
            String cityName = scanner.nextLine();
            
            

            // Set the check-in and check-out dates (you can modify this as needed)
            String checkInDate = "2024-04-27";
            String checkOutDate = "2024-04-28";

            // Prepare the query string
            String queryString = "?currency=USD&locale=en_US&query=" + cityName +
                                "&checkInDate=" + checkInDate + "&checkOutDate=" + checkOutDate;

            HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://booking-com15.p.rapidapi.com/api/v1/test"))
              .header("X-RapidAPI-Key", "97c6cac96amshf7cfe7731f1f3e4p184c8ejsn586eed84dc6b")
              .header("X-RapidAPI-Host", "booking-com15.p.rapidapi.com")
              .method("GET", HttpRequest.BodyPublishers.noBody())
              .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            // Display the response code
            System.out.println("Response code: " + response.statusCode());

            // Display the hotel names from the response body
            System.out.println("Hotel names in " + cityName + ":");
            String responseBody = response.body();
            // Parsing and extracting hotel names from the response body can be done here
            System.out.println(responseBody);

            // Close the scanner
            scanner.close();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
