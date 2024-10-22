import jdk.dynalink.StandardOperation;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
import java.util.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Main {
    public static  void main(String[] args) {
        System.out.println("1 dolar =>> Peso argentino");
        System.out.println("2 Peso argentino =>> dolar");
        System.out.println("3 dolar =>> Real brasilero");
        System.out.println("4 Real brasilerio =>> dolar");
        System.out.println("5 dolar =>> pesos colombiano");
        System.out.println("6 pesos colombianos =>> dolar");
        System.out.println("7 Salir");
        System.out.println("Elija una opcion valida");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        Convertidor convertidor = new Convertidor();

        switch (opcion) {
            case 1:
                opcion = 1;
                double monto = SolicitaMonto();
                System.out.println("El valor " + monto + " [USD] al valor final de =>>> " +convertidor.ConvertirMoneda("USD","ARS", monto )+ " [ARS]");

                break;
            case 2:
                opcion = 2;
                double monto1 = SolicitaMonto();
                System.out.println("El valor " + monto1 + " [ARS] al valor final de =>>> " + convertidor.ConvertirMoneda("ARS","USD", monto1) + " [USD]");
                break;

            case 3:
                opcion = 3;
                double monto2 = SolicitaMonto();
                System.out.println("El valor " + monto2 + " [USD] al valor final de =>>> " + convertidor.ConvertirMoneda("USD","BRL", monto2) + " [BRL]");
                break;

            case 4:
                opcion = 4;
                double monto3 = SolicitaMonto();
                System.out.println("El valor " + monto3 + " [BRL] al valor final de =>>> " + convertidor.ConvertirMoneda("BRL","USD", monto3) + " [USD]");
                break;

            case 5:
                opcion = 5;
                double monto4 = SolicitaMonto();
                System.out.println("El valor " + monto4 + " [USD] al valor final de =>>> " + convertidor.ConvertirMoneda("USD","COP", monto4) + " [COP]");
                break;

            case 6:
                opcion = 6;
                double monto5 = SolicitaMonto();
                System.out.println("El valor " + monto5 + " [COP] al valor final de =>>> " + convertidor.ConvertirMoneda("COP","USD", monto5) + " [USD]");
                break;

            case 7:
                System.exit(0);
                break;

        }

    }
    public static double SolicitaMonto(){
        System.out.println("Ingrese el Monto a convertir");
        Scanner leerSolicitaMonto = new Scanner(System.in);
        return leerSolicitaMonto.nextDouble();
    }
}

