
package travel.management;
import java.awt.Color;
import javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.net.URL;


public class Destinations extends JFrame implements Runnable{
    
    JLabel l1, l2, l3, l4, l5, l6,l7,l8,l9, l10;
    JLabel[] label = new JLabel[]{l1, l2, l3, l4, l5, l6,l7,l8,l9, l10};
    Thread t1;
    //JLabel Caption;
    
    public void run(){
        
        String[] text = {"JW Marriott Hotel","Madirana Oriental Hotel","Four Season Hotel","Raddison Blue Hotel","Classsio Hotel","The Bay Club Hotel","Brize Blow Hotel","The Taj Hotel","Happy Motel Hotel", "River View Hotel"};
        try{
            for(int i=0; i<9; i++){
                label[i].setVisible(true);
               // Caption.setText(text[i]);
                Thread.sleep(2500);
                 label[i].setVisible(false);
            }
    } catch(Exception e){
        e.printStackTrace();
    }
    }
    
    Destinations(){
        setBounds(500, 200, 800, 600);
        setLayout(null);
        
       
       /* ImageIcon  i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null, i10 = null;
        ImageIcon[] image = new ImageIcon[]{i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
        
        Image  j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null, j10 = null;
        Image[] jimage = new Image[]{j1, j2, j3, j4, j5, j6, j7, j8, j9, j10};
        
        ImageIcon  k1 = null, k2 = null, k3 = null, k4 = null, k5 = null, k6 = null, k7 = null, k8 = null, k9 = null, k10 = null;
        ImageIcon[] kimage = new ImageIcon[]{k1, k2, k3 ,k4, k5, k6, k7, k8, k9, k10};
        
       for(int i =0; i < 9; i++){
             image[i] = new ImageIcon(ClassLoader.getSystemResource("Icons/dest"+(i+1)+".jpg"));
             jimage [i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
             kimage[i] = new ImageIcon(jimage[i]);
             label[i] = new JLabel(kimage[i]);
             label[i].setBounds(0, 0, 800, 600);
             add(label[i]);
        
        } */
       
       // the below code is my own generated code with the help of chatgpt
       
       ImageIcon[] image = new ImageIcon[10];
       Image[] jimage = new Image[10];
       ImageIcon[] kimage = new ImageIcon[10];

       String[] fileExtensions = {".jpg", ".jpeg", ".png"};

       for (int i = 0; i < 10; i++) {
            for (String extension : fileExtensions) {
                  String imageName = "Icons/dest" + (i + 1) + extension;
                   URL imageUrl =  ClassLoader.getSystemResource(imageName);
                     if (imageUrl != null) {
                       image[i] = new ImageIcon(imageUrl);
                       jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                        kimage[i] = new ImageIcon(jimage[i]);
                        label[i] = new JLabel(kimage[i]);
                        label[i].setBounds(0, 0, 800, 600);
                        add(label[i]);
                         break; // Exit the loop if the image is found with the current extension
                   }
            }
       }




        
        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
        
    }
    public static void main(String[] args){
        new Destinations();
    }
}
