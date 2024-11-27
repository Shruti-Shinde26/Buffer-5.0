package Buffer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class WeatherApp extends JFrame {
    private JTextField placeTextField;
    private JTextField dateTextField;
    private JTextArea resultTextArea;

    public WeatherApp() {
        setTitle("Weather App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel placeLabel = new JLabel("Place:");
        placeTextField = new JTextField(20);
        JLabel dateLabel = new JLabel("Date:");
        dateTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);

        panel.add(placeLabel);
        panel.add(placeTextField);
        panel.add(dateLabel);
        panel.add(dateTextField);
        panel.add(searchButton);
        panel.add(new JScrollPane(resultTextArea));

        add(panel);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String place = placeTextField.getText();
                String date = dateTextField.getText();
                String weatherInfo = getWeatherInfo(place, date);
                resultTextArea.setText(weatherInfo);
            }
        });
    }

    private String getWeatherInfo(String place, String date) {
        try {
            URL url = new URL("https://api.weatherapi.com/v1/forecast.json?key=126380ad6b9645fba2c155706242904&q=" + place + "&dt=" + date);
         
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject jsonObject = new JSONObject(response.toString());
                JSONObject current = jsonObject.getJSONObject("current");
                JSONObject condition = current.getJSONObject("condition");
               String weatherCondition = condition.getString("text");
                double temperature = current.getDouble("temp_c");
               String msg="";
               if (temperature>35.0 || weatherCondition.equalsIgnoreCase("Overcast")) {
                msg=" Not Advisable to visit the place!!";
               }
               else
               {
                msg="Advisable to visit the place!!";
               }
               return "Weather Condition: " + weatherCondition + "\nTemperature: " + temperature + "°C" +"\n" +"Advise: "+msg;
          
           
            } else {
                return "Error: Unable to retrieve weather information. Response Code: " + responseCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherApp().setVisible(true);
            }
        });
    }
}
