package Convert;

import com.google.gson.JsonObject;

import java.io.IOException;

import static Data.API.getData;

public class FromUSD {
    // Método para convertir de dólares a la moneda seleccionada
    public static double convertFromUSD(double amount, String targetCurrency) throws IOException {
        JsonObject conversionRates = getData();
        double rate = conversionRates.get(targetCurrency).getAsDouble();
        return amount * rate;
    }
}
