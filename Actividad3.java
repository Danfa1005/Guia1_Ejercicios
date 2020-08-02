
import java.lang.Math; //Importar para arccos, sin, cos y conversion de lat y long a radianes
import java.util.Scanner; //Importar teclado

public class Actividad3
{
    public static void main(String[] args)
    {
        //Declarar variables
        double latitud1, latitud2, longitud1, longitud2, distanciakm;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese latitud, en grados decimales," 
                            + "\r\n" + "de la primera ciudad: ");
        latitud1 = teclado.nextDouble();
        
        System.out.println("Ingrese longitud, en grados decimales," 
                           + "\r\n" + "de la primera ciudad: ");
        longitud1 = teclado.nextDouble();
        
        System.out.println("Ingrese latitud, en grados decimales," 
                           + "\r\n" + "de la segunda ciudad: ");
        latitud2 = teclado.nextDouble();
        
        System.out.println("Ingrese longitud, en grados decimales," 
                           + "\r\n" + "de la segunda ciudad: ");
        longitud2 = teclado.nextDouble();
        
        //Calculo, conversion e impresion de resultado
        distanciakm = 6371.07 * Math.acos(Math.sin(Math.toRadians(latitud1)) 
                        * Math.sin(Math.toRadians(latitud2)) 
                        + Math.cos(Math.toRadians(latitud1)) * Math.cos(Math.toRadians(latitud2)) 
                        * Math.cos(Math.toRadians(longitud1-longitud2)));
        System.out.println("La distancia entre las dos ciudades en kilometros"
                            + "\r\n" + "es de: "+ distanciakm);
    } //Fin de main
} //Fin de Actividad3
