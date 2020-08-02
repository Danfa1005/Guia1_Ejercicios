
import java.lang.Math; //Importar para tan y PI
import java.util.Scanner; //Importar teclado

public class Actividad6
{
  public static void main(String[] args)
  {
      //Declaracion de variables
      int n;
      double s, a;
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Ingrese numero de lados del polígono regular: ");
      n = teclado.nextInt();
      
      System.out.println("Ingrese longitud de un lado del polígono regular: ");
      s = teclado.nextDouble();
      
      //Calculo e impresion de resultados
      a = (n * (s*s)) / (4 * Math.tan(Math.PI/n));
      System.out.println("El área del polígono regular es de: " + a);
  }
}
