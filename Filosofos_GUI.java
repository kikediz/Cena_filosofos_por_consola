/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maximiliano
 */
public class Filosofos_GUI extends JFrame {

        
        private JFrame frame;
        private JPanel jPanel;
        private JTextField [] field;
        private JButton button;
        private Imagen image;
        private Box box;

    public Filosofos_GUI() {
        super("Cena de filosofos");
        image=new Imagen();
        image.setImage(getClass().getResource("filo.png").getFile());
        //jPanel = new JPanel();
        field = new JTextField[5];
        box=new Box(BoxLayout.X_AXIS);
                
        //this.toBack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        etiquetas();
        construir();
    }
    
    public void construir(){
        setMinimumSize(new Dimension(800, 700));
        setSize(800, 700);
        box.setSize(getSize());
        box.add(image);
        getContentPane().add(box);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        //pack();
        field[0].setBounds((int)(getSize().width*0.39), (int)(getSize().height*0.28), 150, 15);
        getContentPane().add(field[0]);
        
    }
    
        
    public void etiquetas(){
        for(int i=0;i<field.length;i++){
            field[i]=new JTextField();
        }
        //field[0].setBounds((int)(getSize().width*0.43), (int)(getSize().height*0.23), 180, 15);
        
        
        
    }
    
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }
    
    public JTextField[] getField() {
        return field;
    }

    public void setField(JTextField [] field) {
        this.field = field;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public Imagen getImage() {
        return image;
    }

    public void setImage(Imagen image) {
        this.image = image;
    }
    
    

}