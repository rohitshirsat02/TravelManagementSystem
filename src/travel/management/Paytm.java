
package travel.management;

import java.awt.Color;
import javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{
    JButton back;
    Paytm(){
        setBounds(500, 200, 800, 600);
        
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try{
            pane.setPage("https://paytm.com/rent-payment");
            
        } catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html> Could not load, Error 404 </html>");
        }
        
        JScrollPane scrollbar = new JScrollPane(pane);
        getContentPane().add(scrollbar);
        
        back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
     
        
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
         
         if(ae.getSource() == back){
             setVisible(false);
             new Payment();
             
         }
            
        }
    public static void main(String[] args){
        new Paytm();
    }
}
