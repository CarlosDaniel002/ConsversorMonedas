package UI;

import Convert.FromUSD;
import Convert.ToUSD;

import java.io.IOException;
import java.util.Scanner;

public class menu
{
    // Método para mostrar el menú y obtener la opción del usuario
    public static int showMenu() {
        System.out.println();
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

    public static double getAmount()
    {
        Scanner scanner = new Scanner(System.in);
        double amount;
        do {
            System.out.println("Ingrese el valor que desea convertir:");
             amount = scanner.nextDouble();
        }while(amount==0);
        return amount;
    }

    public static void doOpcions(int opcion, double amount) throws IOException {

            switch (opcion) {
                case 1:
                    // Convertir de Dólar a Peso argentino
                    try{
                        double amountInUSD = amount;
                        String targetCurrency = "ARS";
                        double convertedAmount = FromUSD.convertFromUSD(amountInUSD, targetCurrency);
                        System.out.printf("%.2f USD equivale a %.2f %s\n", amountInUSD, convertedAmount, targetCurrency);
                    }catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 2:
                    // Convertir de Peso argentino a Dólar
                    try {
                        double amountInTargetCurrency = amount;
                        String sourceCurrency = "ARS";
                        double convertedAmountToUSD = ToUSD.convertToUSD(amountInTargetCurrency, sourceCurrency);
                        System.out.printf("%.2f %s equivale a %.2f USD\n", amountInTargetCurrency, sourceCurrency, convertedAmountToUSD);
                    } catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 3:
                    // Convertir de Dólar a Real brasileño
                    try{
                        double amountInUSD = amount;
                        String targetCurrency = "BRL";
                        double convertedAmount = FromUSD.convertFromUSD(amountInUSD, targetCurrency);
                        System.out.printf("%.2f USD equivale a %.2f %s\n", amountInUSD, convertedAmount, targetCurrency);
                    }catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 4:
                    // Convertir de Real brasileño a Dólar
                    try {
                        double amountInTargetCurrency = amount;
                        String sourceCurrency = "BRL";
                        double convertedAmountToUSD = ToUSD.convertToUSD(amountInTargetCurrency, sourceCurrency);
                        System.out.printf("%.2f %s equivale a %.2f USD\n", amountInTargetCurrency, sourceCurrency, convertedAmountToUSD);
                    } catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 5:
                    // Convertir de Dólar a Peso colombiano
                    try{
                        double amountInUSD = amount;
                        String targetCurrency = "COP";
                        double convertedAmount = FromUSD.convertFromUSD(amountInUSD, targetCurrency);
                        System.out.printf("%.2f USD equivale a %.2f %s\n", amountInUSD, convertedAmount, targetCurrency);
                    }catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 6:
                    // Convertir de Peso colombiano a Dólar
                    try {
                        double amountInTargetCurrency = amount;
                        String sourceCurrency = "COP";
                        double convertedAmountToUSD = ToUSD.convertToUSD(amountInTargetCurrency, sourceCurrency);
                        System.out.printf("%.2f %s equivale a %.2f USD\n", amountInTargetCurrency, sourceCurrency, convertedAmountToUSD);
                    } catch (IOException e) {
                        System.err.println("Error al obtener datos de la Data.API: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Por favor, elija una opción válida.");
            }
    }
}
