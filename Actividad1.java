
import java.lang.Math; //Importar para log y pow
import java.util.Scanner; //Importar para ingresar datos por teclado

public class Actividad1

{
   public static void main(String[] args)
   {
       //Definicion de variables
       int a, b, sumab, menba, prodab, cocab, resab;
       double loga, rab;
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese numero entero para la variable a: ");
       a = teclado.nextInt(); //asignacion de variable a
       
       System.out.print("Ingrese numero entero para la variable b: ");
       b = teclado.nextInt(); //asignacion de variable b
       
       //Calculo e impresion de resultados
       sumab = a+b;
       System.out.println("La suma de a y b es: " + sumab);
       menba = b-a;
       System.out.println("La diferencia cuando b es restado de a es: " + menba);
       prodab = a*b;
       System.out.println("El producto de a y b es: " + prodab);
       cocab = a/b;
       System.out.println("El cociente cuando a es dividido entre b es: " + cocab);
       resab = a%b;
       System.out.println("El residuo de la division de a entre b es: " + resab);
       loga = Math.log10(a);
       System.out.println("El resultado de encontrar el logaritmo de a es: " + loga);
       rab = Math.pow(a,b);
       System.out.println("El resultado de hallar a^b es: " + rab);
   } //Fin de main
} //Fin de la clase Actividad1
