
import java.util.Scanner; //importar teclado
import java.lang.Math; //importar para PI y radio al poder de 3

public class Actividad4
{
   public static void main(String[] args)
   {
       //Declarar variables
       double r, a, v;
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese valor de radio del circulo: ");
       r = teclado.nextDouble();
       
       //Calculo e impresion de resultados
       a = Math.PI * (r*r);
       System.out.println("El area del circulo es: " + a);
       v = (4*Math.PI*Math.pow(r,3)) / 3;
       System.out.println("El volumen de la esfera es: " + v);
   }
}
