package edu.escuelaing.arem.ASE.app;

import java.util.*;

public class LinkedList {

    private Puntero cabeza, cola;
    private Collection<Puntero> listaEnlazada;

    public LinkedList(String[] datos) {
        this.cabeza = null;
        this.cola=null;
        listaEnlazada=new ArrayList<Puntero>();
        for (String i: datos) {
            double temp;

            temp=Double.parseDouble(i);
            Puntero nuevo=new Puntero(temp);
            listaEnlazada.add(nuevo);
        }
        }

    /**
     * Este método se encarga de devolver la actual cabeza de la lista enlazada.
     * @return El puntero que hace referencia a la cabeza de la lista enlazada.
     */
    public Puntero getCabeza() {
        return cabeza;
    }

    /**
     *Este método se encarga de devolver la actual cola de la lista enlazada.
     * @return El puntero que hace referencia a la cola de la lista enlazada.
     */
    public Puntero getCola() {
        return cola;
    }

    /**
     * Este método se encarga de fijar el valor como la nueva cabeza.
     * @param cabeza El parametro cabeza pasará a ser la nueva cabeza de la lista enlazada.
     */
    public void setCabeza(Puntero cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Este método se encarga de fijar el valor como la nueva cola.
     * @param cola El parametro cabeza pasará a ser la nueva cabeza de la lista cola.
     */
    public void setCola(Puntero cola) {
        this.cola = cola;
    }

    /**
     * Este método se encarga de adicionar el nuevo elemento de la lista enlazada al final de la misma.
     * @param nuevo El parametro nuevo es el nuevo elemento de la lista enlazada.
     */
    public void add(Puntero nuevo){
        if (listaEnlazada.isEmpty()){ setCabeza(nuevo);}

        else {
            Puntero nuevaCola=getCola();
            if (nuevaCola!=null){
                setCola(nuevo);
                nuevo.setAnterior(nuevaCola);
                nuevaCola.setSiguiente(nuevo);
            }
        }
        listaEnlazada.add(nuevo);
    }

    /**
     * Este método se encarga de remover el elemento de la lista encadenada.
     * @param viejo El parametro viejo es el elemento que se va a eleminar de la lista enlazada.
     */
    public void remove(Puntero viejo){
        Puntero sig,ant;
        sig=viejo.getSiguiente();
        ant=viejo.getAnterior();
        if (sig == null){
            setCola(ant);
        }
        if(ant==null){
            setCabeza(sig);
        }
        else{
            ant.setSiguiente(sig);
        }
        listaEnlazada.remove(viejo);
    }

    /**
     * Este método se encarga de calcular la media de una lista enlazada.
     * @return Retorna El valor de la media de los datos presentes en la lista enlazada.
     */
    public double media(){
        double res=0;
        for (Puntero i:listaEnlazada) {
            res+=i.getValor();

        }
        return res/ listaEnlazada.size();
    }

    /**
     * Este método se encarga de calcular la desviación estandar de una lista enlazada.
     * @return El valor de la desviación estandar de los datos presentes en la lista enlazada.
     */
    public double desviacion(){
        double media=media();
        double des=0;
        for (Puntero i:listaEnlazada) {
            des+=Math.pow(i.getValor()-media,2);
        }
        return Math.sqrt(des/(listaEnlazada.size()-1));
    }

    /**
     * Este método se encarga de devolver el valor inmediatamente previo al valor seleccionado.
     * @param p El parametro p es el puntero base.
     * @return
     */
    public Puntero nextNode(Puntero p){
        return p.getSiguiente();
    }

    /**
     * Este método se encarga de devolver el valor inmediantamente anterior al valor seleccionado.
     * @param p El parametro p es el puntero base.
     * @return Retorna el siguiente puntero al puntero base.
     */
    public Puntero priorNode(Puntero p){
        return p.getAnterior();
    }

    /**
     *Este método se encarga de mostrar todos los datos de la lista enlazada.
     */
    public void mostrarLista(){
        if(!listaEnlazada.isEmpty()){
            for (Puntero i:listaEnlazada) {
                System.out.println(i.getValor());
            }
        }
    }
}
