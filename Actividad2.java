
import java.util.Scanner; //Importar teclado


public class Actividad2
{
   public static void main(String[] args) 
   {
       //Declarar variables
       double mpg, lpg;
       Scanner teclado = new Scanner(System.in);
       
       //Pedir al usuario la eficiencia en Millas por galon
       System.out.print("Ingrese la eficiencia del vehículo en" + "\r\n" + "Millas por Galón (MPG): ");
       mpg = teclado.nextDouble();
       
       //Calcular e imprimir resultado
       lpg = mpg*2.3521;
       System.out.println("La eficiencia del vehículo en" + "\r\n" + "Litros por Kilómetro (LPK) es: "
                            + lpg);
   }
}
