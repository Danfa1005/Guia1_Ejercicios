
import java.util.Scanner; //importar teclado
import java.lang.Math; //importar para PI

public class Actividad10
{
    public static void main(String[] args)
    {
        //Declarar variables
        double r1, h1, r2, h2, v;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese radio de la base del cono completo: ");
        r1 = teclado.nextDouble();
        
        System.out.println("Ingrese altura del cono completo: ");
        h1 = teclado.nextDouble();
        
        System.out.println("Ingrese radio de la base del cono deficiente: ");
        r2 = teclado.nextDouble();
        
        System.out.println("Ingrese altura del cono deficiente: ");
        h2 = teclado.nextDouble();
        
        //Calculo e impresion de resultado
        v = ((Math.PI*(r1*r1)*h1)/3) - ((Math.PI*(r2*r2)*h2)/3);
        System.out.println("El volumen del tronco de cono es de: " + v);        
    }
}
