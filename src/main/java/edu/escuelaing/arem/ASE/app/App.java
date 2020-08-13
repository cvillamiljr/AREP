package edu.escuelaing.arem.ASE.app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String linea = new String("0.0000000005,0.0000005,0.000005,0.005");

        operaciones(linea);
    }

    public static void operaciones(String linea){
        String[] Lista = linea.split(",");
        ListaEnlazada listaDatos = new ListaEnlazada(Lista);
        System.out.println("Media: "+listaDatos.media()+" DE: "+listaDatos.desviacion());
    }
}
