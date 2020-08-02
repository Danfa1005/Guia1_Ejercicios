
import java.util.Scanner; //importar teclado
import java.lang.Math; //importar para redondeo hacia arriba

public class Actividad9
{
   public static void main(String[] args)
   {
       //Declarar variables
       double num_gor, num_flac, num_pas;
       double num_bus, num_plat, costo_plat, num_hab, costo_hab, costo_tot_hab;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese numero de estudiantes gordos: ");
       num_gor = teclado.nextFloat();
       
       System.out.println("Ingrese numero de estudiantes flacos: ");
       num_flac = teclado.nextFloat();
       
       System.out.println("Ingrese numero de dias que dura el paseo: ");
       num_pas = teclado.nextFloat();
       
       //Calculo e impresion de resultados
       num_bus = Math.ceil(((num_gor*2) + num_flac)/60);
       System.out.println("Numero de buses necesarios para el paseo: " + num_bus);
       
       num_plat = ( (num_gor*5) + (num_flac*3) ) * num_pas;
       System.out.println("Numero total de platos de comida que hay que servir" + "\n" +
                          "en el paseo es de: " + num_plat);
       
       costo_plat = num_plat * 10000;
       System.out.println("El costo total de todos los platos de comida en todos los dias" + "\n" +
                          "que estan los estudiantes de paseo es de " + costo_plat + " pesos.");
       
       num_hab = Math.ceil( (num_gor+num_flac) / 4);
       System.out.println("Numero de habitaciones necesarias: " + num_hab);
       
       costo_hab = num_hab * 25000;
       System.out.println("El costo total de las habitaciones por dia es de " + costo_hab + " pesos.");
       
       costo_tot_hab = costo_hab * num_pas;
       System.out.println("El costo total de las habitaciones en todo el paseo es de " + costo_tot_hab + " pesos.");
   }
}
