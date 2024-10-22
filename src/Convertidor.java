import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Convertidor {
    public double ConvertirMoneda (String monedaBase,String monedaAConvertir, double monto) {
        String apiKey = "9b593ad8bff45e3ec8735a23"; // Reemplaza con tu clave de API
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%s", apiKey, monedaBase, monedaAConvertir, monto);

        try {
            // Crear el cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear la solicitud HTTP GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ExchangeRateResponse resultado = gson.fromJson(response.body(), ExchangeRateResponse.class);

            return resultado.getConversionResult();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
