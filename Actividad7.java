
import java.util.Scanner; //importar teclado
import java.lang.Math; //importar para redondeos

public class Actividad7
{
   public static void main(String[] args)
   {
       //Declarar variables
       double kilos_necesarios, kilos_camion, galones_kilometro;
       double dtotal,pgalon, viajes, galones_viaje, gasolina_viaje;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese numero total de kilogramos necesarios para");
       System.out.println("transportar en el camión: ");
       kilos_necesarios = teclado.nextDouble();
       
       System.out.println("Ingrese numero total de kilogramos que el camión es capaz");
       System.out.println("de llevar: ");
       kilos_camion = teclado.nextDouble();
       
       System.out.println("Ingrese numero del consumo de galones de gasolina por kilometro");
       System.out.println("del camión: ");
       galones_kilometro = teclado.nextDouble();
       
       //Calculo e impresion de resultados
       viajes = Math.ceil(kilos_necesarios / kilos_camion); //redondear hacia arriba
       System.out.println("El numero de viajes necesarios para transportar todos " + "\n" +
                         "los elementos es de: " + viajes);
       
       dtotal = 80.3; //Distancia total entre Bogota y Sasaima
       galones_viaje = dtotal * galones_kilometro; 
       System.out.println("Los galones consumidos en cada uno de" + "\n" +
                         "los viajes es de: " + galones_viaje);
       
       pgalon = 10000; //Precio por galon
       gasolina_viaje = Math.round(pgalon * galones_viaje);
       System.out.println("El costo de la gasolina por viaje es de: " + gasolina_viaje + " Pesos");                  
   }
}
