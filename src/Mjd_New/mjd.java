package Mjd_New;

import java.awt.Color;




import java.awt.Component;
import java.awt.Font;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class mjd implements ActionListener {
	JButton mjdbutton1M;
	JButton mjdbutton2M;
	JButton mjdbutton3M;
	JButton mjdbutton4M;
	JButton setButton;


	mjd() {
 		

		mjdbutton1M = new JButton("Fun Package A");
		mjdbutton2M = new JButton("Study Package B");
		mjdbutton3M = new JButton("Package C");
		mjdbutton4M = new JButton("More About MJD");
		setButton = new JButton("Settings");
		
		Border mjdline = new LineBorder(Color.GREEN);
		Border mjdmargin = new EmptyBorder(5, 15, 5, 15);
		Border mjdcompound = new CompoundBorder(mjdline, mjdmargin);	 

		JPanel mjdpanel = new JPanel();
		JLabel mjdLabel = new JLabel ();
		JFrame mjdFrame = new JFrame();
		Border mjdBorder = BorderFactory.createLineBorder(Color.green, 5);
		
		mjdLabel.setForeground(Color.green);
	    mjdpanel.setBorder(BorderFactory.createEmptyBorder(90, 90, 70, 90));
		mjdLabel.setBounds(0,0,520,520);
		mjdLabel.setBorder(mjdBorder);



		
 
			
		mjdbutton1M.setForeground(Color.BLACK);
		mjdbutton1M.setBackground(Color.WHITE);
		mjdbutton1M.setBorder(mjdcompound); 
	    mjdbutton2M.setForeground(Color.BLACK);
   		mjdbutton2M.setBackground(Color.WHITE);
   		mjdbutton2M.setBorder(mjdcompound);
	 	mjdbutton3M.setForeground(Color.BLACK);
	 	mjdbutton3M.setBackground(Color.WHITE);
	 	mjdbutton3M.setBorder(mjdcompound);

	 	
	 	setButton.setForeground(Color.BLACK);
	 	setButton.setBackground(Color.WHITE);
	 	setButton.setBorder(mjdcompound);
		
	 
		mjdbutton1M.setVisible(true); 
		mjdbutton1M.setBounds(140, 50, 250, 50);
		mjdbutton1M.addActionListener(this);
		
		
		mjdbutton2M.setVisible(true); 
		mjdbutton2M.setBounds(140, 120, 250, 50);
		mjdbutton2M.addActionListener(this);

		mjdbutton3M.setVisible(false); 
		mjdbutton3M.setBounds(140, 460, 250, 50);
		mjdbutton3M.addActionListener(this);
		
		
		mjdbutton4M.setVisible(true); 
		mjdbutton4M.setBounds(140, 400, 250, 50);
		mjdbutton4M.addActionListener(this);

		
		setButton.setVisible(true);
		setButton.setBounds(415, 465, 100, 50);
		setButton.addActionListener(this);
		
		

		mjdFrame.setLayout(null);
		mjdFrame.setResizable(false);
		mjdFrame.setVisible(true);
		mjdFrame.setTitle("MJD"); 
		mjdFrame.setSize(536,560);
		mjdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mjdFrame.add(mjdLabel);
		mjdFrame.add(mjdbutton1M);
		mjdFrame.add(mjdbutton2M);
	    mjdFrame.add(mjdbutton3M);
		mjdFrame.add(mjdbutton4M);
		mjdFrame.add(setButton);

			
	}

public static void main(String[] args) throws IOException {
	new mjd();
	 }



	public void open (File file) throws IOException  {
	
	System.out.println("asd");
	
}	
	@Override
	public void actionPerformed(ActionEvent e) {

if(e.getSource()==setButton) {
    try {
    	new Frame();

 	  } catch (Exception ex) {
 	    ex.printStackTrace();
 	  }
}


		if(e.getSource()==mjdbutton2M) {
           
            try {

            String URL1a;
            URI uri= new URI("www.google.com");
      	   java.awt.Desktop.getDesktop().browse(uri);
    		    } catch (Exception ex) {
          	    ex.printStackTrace();
          	  }
		}
	      
		if(e.getSource()==mjdbutton4M) {
            try {
            	
         	   URI uri= new URI("https://mjd.law.blog/");
         	   java.awt.Desktop.getDesktop().browse(uri);
               JOptionPane.showMessageDialog(null, "Thanks for your time");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}}
}

