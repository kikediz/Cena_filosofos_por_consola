/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

/**
 *
 * @author morte
 */
class Controlar extends Object
{
    private int contador;

    public Controlar(int contador) {    //Constructor de la clase
        this.contador = contador;       //Iguala la variable global con la local recibida por parametro
    }

    public void esperar_turno(){        //metodo para lanzar hilo de espera
        synchronized (this) {  //singleton
            while (this.contador <= 0) {        //bucle para controlar el hilo de espera
                // We must wait
                try {
                    wait();     //hilo de espera
                } catch (InterruptedException ex) {
                    // I was interupted, continue onwards
                }
            }
            // We can decrement the count
            this.contador--;        //decrementa la variable global en uno
        }
    }

    public void tomar_turno(){      //metodo para lanzar hilo al desocupar la "cola de hilos"
        synchronized (this) {       //singleton
            this.contador++;        //incrementa la variable global en uno
            
            if (this.contador == 1 ) {      //condicion que al cumplirse lanza un hilo
                notify();       //lanza un hilo
            }
        }
    }
}