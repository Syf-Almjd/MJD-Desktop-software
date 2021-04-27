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
import javax.swing.JTextField;
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


public class Frame extends mjd implements ActionListener {
	JButton mjdbutton1;
	JButton mjdbutton2;
	JButton mjdbutton3;
	JButton mjdbutton4;
	JButton mjdbutton5;
	JButton mjdbutton6;
	JButton mjdbutton7;
	JButton mjdbutton8;
	String Option1 = "Add button";
	String Option2 = "Remove button";
	String Option3 = "More Settings..";
	String Option4 = "Contact developer";
	String Option5 = "Unhide Mode On/Off";
	String Option6 = "Full Unhide Mode On/Off";
	String Option7 = "POP-UPS On/Off";
	String Option8 = "Background On/Off";

	    
	    
Frame() {
	mjdbutton1 = new JButton(Option1);
	mjdbutton2 = new JButton(Option2);
	mjdbutton3 = new JButton(Option3);
	mjdbutton4 = new JButton(Option4);
	mjdbutton5 = new JButton(Option5);
	mjdbutton6 = new JButton(Option6);
	mjdbutton7 = new JButton(Option7);
	mjdbutton8 = new JButton(Option8);
	ImageIcon mjdlogo = new ImageIcon("logo.png");


		Border mjdline = new LineBorder(Color.BLUE);
		Border mjdmargin = new EmptyBorder(5, 15, 5, 15);
		Border mjdcompound = new CompoundBorder(mjdline, mjdmargin);	 


		JPanel mjdpanel = new JPanel();
		JLabel mjdLabel = new JLabel ();
		JFrame mjdFrame1 = new JFrame();
		
		mjdLabel.setForeground(Color.BLUE);
		mjdpanel.add(mjdbutton1);

		mjdbutton1.setForeground(Color.BLACK);
		mjdbutton1.setBackground(Color.WHITE);
		mjdbutton1.setBorder(mjdcompound); 
		
	    mjdbutton2.setForeground(Color.BLACK);
   		mjdbutton2.setBackground(Color.WHITE);
   		mjdbutton2.setBorder(mjdcompound);
   		
	 	mjdbutton3.setForeground(Color.BLACK);
	 	mjdbutton3.setBackground(Color.WHITE);
	 	mjdbutton3.setBorder(mjdcompound);
	 	
		mjdbutton4.setForeground(Color.BLACK);
		mjdbutton4.setBackground(Color.WHITE);
		mjdbutton4.setBorder(mjdcompound); 
		
	    mjdbutton5.setForeground(Color.BLACK);
   		mjdbutton5.setBackground(Color.WHITE);
   		mjdbutton5.setBorder(mjdcompound);
   		
	 	mjdbutton6.setForeground(Color.BLACK);
	 	mjdbutton6.setBackground(Color.WHITE);
	 	mjdbutton6.setBorder(mjdcompound);
	 	
	    mjdbutton7.setForeground(Color.BLACK);
   		mjdbutton7.setBackground(Color.WHITE);
   		mjdbutton7.setBorder(mjdcompound);
   		
	 	mjdbutton8.setForeground(Color.BLACK);
	 	mjdbutton8.setBackground(Color.WHITE);
	 	mjdbutton8.setBorder(mjdcompound);
		
		


		mjdbutton1.setVisible(true); 
		mjdbutton1.setBounds(10, 10, 200, 40);
		mjdbutton1.addActionListener(this);
		
		mjdbutton2.setVisible(true); 
		mjdbutton2.setBounds(230, 10, 200, 40);
		mjdbutton2.addActionListener(this);

		//mjdbutton5.setVisible(true); 
		//mjdbutton5.setBounds(420, 10, 200, 40);
		//mjdbutton5.addActionListener(this);
		
		
		//	mjdbutton6.setVisible(true); 
		//mjdbutton6.setBounds(640, 10, 200, 40);
		//mjdbutton6.addActionListener(this);
		
		

		mjdbutton4.setVisible(true); 
		mjdbutton4.setBounds(10, 60, 200, 40);
		mjdbutton4.addActionListener(this);
		
		mjdbutton3.setVisible(true); 
		mjdbutton3.setBounds(230, 60, 200, 40);
		mjdbutton3.addActionListener(this);

		//mjdbutton7.setVisible(true); 
		//mjdbutton7.setBounds(420, 60, 200, 40);
		//mjdbutton7.addActionListener(this);
		
		
		//mjdbutton8.setVisible(true); 
		//mjdbutton8.setBounds(640, 60, 200, 40);
		//mjdbutton8.addActionListener(this);
		
		
		
		
		

		mjdFrame1.setLayout(null);
		mjdFrame1.setResizable(false);
		mjdFrame1.setVisible(true);
		mjdFrame1.setTitle("Settings"); 
		mjdFrame1.setSize(460,155);
		//mjdFrame.pack();
		mjdFrame1.add(mjdLabel);
		mjdFrame1.add(mjdbutton1);
		mjdFrame1.add(mjdbutton2);
	    mjdFrame1.add(mjdbutton3);
		mjdFrame1.add(mjdbutton4);
		mjdFrame1.add(mjdbutton5);
		mjdFrame1.add(mjdbutton6);
	    mjdFrame1.add(mjdbutton7);
		mjdFrame1.add(mjdbutton8);
		mjdLabel.setIcon(mjdlogo);
		mjdFrame1.setIconImage(mjdlogo.getImage());
		mjdFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
	}

public static void main(String[] args){
	new Frame();
	 }


	@Override
	public void actionPerformed (ActionEvent e) {		
		
		if(e.getSource()==mjdbutton1) {
            try {

            	mjdbutton3M.setVisible(true);
            	mjdbutton3M.setEnabled(true);
       			JOptionPane.showMessageDialog(null, "Button C Added");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
		if(e.getSource()==mjdbutton2) {
           
            try {
          	
            	mjdbutton3M.setVisible(false);
            	mjdbutton3M.setEnabled(false);

       			JOptionPane.showMessageDialog(null, "Button C Removed");
          	  } catch (Exception ex) {
          	    ex.printStackTrace();
          	  }

		}

		if(e.getSource()==mjdbutton3) {
            try {
            	

                JOptionPane.showMessageDialog(null, "Underdevelopment.. \nThank you for your patience");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
		if(e.getSource()==mjdbutton4) {
            try {
            	
          	   URI uri= new URI("https://mjd.law.blog/contact/");
          	   java.awt.Desktop.getDesktop().browse(uri);
                JOptionPane.showMessageDialog(null, "Thanks for your time");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
		if(e.getSource()==mjdbutton5) {
            try {

               JOptionPane.showMessageDialog(null, "Opened Package A");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
		if(e.getSource()==mjdbutton6) {
           
            try {
          	

   			JOptionPane.showMessageDialog(null, "Opened Package B");
          	  } catch (Exception ex) {
          	    ex.printStackTrace();
          	  }

		}
		if(e.getSource()==mjdbutton7) {
            try {
         	   
               JOptionPane.showMessageDialog(null, "Thanks for your time1");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		
		if(e.getSource()==mjdbutton8) {
            try {
         	   
               JOptionPane.showMessageDialog(null, "Thanks for your time2");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
            
		}
		}
	}
