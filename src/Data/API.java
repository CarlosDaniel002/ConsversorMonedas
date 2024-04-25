package Data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class API
{
    // Método para obtener los datos de la API
    public static JsonObject getData() throws IOException {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/47b864b2d0ba3eb22f133055/latest/USD";

        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        String req_result = jsonobj.get("result").getAsString();
        return jsonobj.get("conversion_rates").getAsJsonObject();
    }
}
