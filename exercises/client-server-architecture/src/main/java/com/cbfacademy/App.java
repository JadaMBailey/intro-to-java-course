package com.cbfacademy;

import java.net.URI;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Socket;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            URL url = new URI("https://codingblackfemales.com/").toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }

                // Closing the connection
                connection.disconnect();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Socket randomSocket = new Socket("196.547.789.32",5000);
        }
    }
}