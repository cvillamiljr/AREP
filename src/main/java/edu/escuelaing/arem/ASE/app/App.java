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
        String linea = new String("15,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");

        operaciones(linea);
    }

    public static void operaciones(String linea){
        String[] Lista = linea.split(",");
        ListaEnlazada listaDatos = new ListaEnlazada(Lista);
        System.out.println("Media: "+listaDatos.media()+" DE: "+listaDatos.desviacion());
    }
}
