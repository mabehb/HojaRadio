/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojaradio;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author marcosb11
 */
public class HojaRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new radioGUI());
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
