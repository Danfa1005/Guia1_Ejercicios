
import java.util.Scanner; //importar teclado

public class Actividad5
{
   public static void main(String[] args)
   {
      //Declarar variables
      double m, c, incrementoT, q, c1, q1;
      Scanner teclado = new Scanner(System.in);
       
      System.out.println("Ingrese la masa, en gramos celsius, de la cantidad de agua: ");
      m = teclado.nextDouble();
       
      System.out.println("Ingrese la temperatura, en grados, que desea aumentar" + "\n" +
                            "de la cantidad de agua especificada: ");
      incrementoT = teclado.nextDouble();
      
      //Calculo e impresion de variables
      c = 1;
      q = m*c*incrementoT;
      c1= 4.1868;
      q1= m*c1*incrementoT;
      System.out.println("La cantidad total de energia que se necesita para" + "\n"
                        + "para alcanzar la temperatura deseada es de: " + q + " Calorias o "
                        + q1 + " Julios");
      
   }
}
