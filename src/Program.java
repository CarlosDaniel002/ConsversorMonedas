//By Carlos Daniel Taveras Liranzo
import Convert.FromUSD;
import Convert.ToUSD;
import Data.API;
import UI.menu;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException
    {
        while (true) {
            //Mostrando Menu
            int opcion = menu.showMenu();

            //Obteniendo monto
            double amount = menu.getAmount();

            //Convertidor
            menu.doOpcions(opcion, amount);
        }
    }
}
