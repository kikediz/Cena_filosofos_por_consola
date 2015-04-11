/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author maximiliano
 */
public class Main {
    Filosofos_GUI fgui;
    Cena_filosofos cena_filosofos;
    public Main(){
        fgui = new Filosofos_GUI();
        cena_filosofos=new Cena_filosofos();
    }
    
    public static void main(String args[]) { 
        Thread thread = new Thread(
            new Runnable() {

            @Override
            public void run() {
                new Main();
            }
        });
        thread.start();
    }
}
