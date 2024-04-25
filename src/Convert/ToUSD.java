package Convert;

import com.google.gson.JsonObject;

import java.io.IOException;

import static Data.API.getData;

public class ToUSD {
    // Método para convertir de la moneda seleccionada a dólares
    public static double convertToUSD(double amount, String sourceCurrency) throws IOException {
        JsonObject conversionRates = getData();
        double rate = conversionRates.get(sourceCurrency).getAsDouble();
        return amount / rate;
    }
}
