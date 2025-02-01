import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIClient {
    public static void main(String[] args) {
        try {
            // URL dell'API (modificalo con l'endpoint che desideri utilizzare)
            String apiUrl = "https://jsonplaceholder.typicode.com/posts";

            // Crea un oggetto URL
            URL url = new URL(apiUrl);

            // Apre una connessione all'URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Imposta il metodo della richiesta (GET, POST, etc.)
            connection.setRequestMethod("GET");

            // Imposta le intestazioni (se necessarie)
            connection.setRequestProperty("Accept", "application/json");

            // Ottieni la risposta
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Leggi il contenuto della risposta
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Stampa la risposta
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
