package Mjd_New;

import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.net.URI;


public class Frame implements ActionListener {
	JButton mjdbutton1;
	JButton mjdbutton2;
	JButton mjdbutton3;
	JButton mjdbutton4;
	mjd mjd = new mjd();
	//ToDo The following buttons for options will be added later

//	JButton mjdbutton5;
//	JButton mjdbutton6;
//	JButton mjdbutton7;
//	JButton mjdbutton8;

	
	String Option1 = "Add button";
	String Option2 = "Remove button";
	String Option3 = "Updata URL";
	String Option4 = "Contact developer";
	
	//ToDo The following options will be added later
	
//	String Option5 = "Unhide Mode On/Off";
//	String Option6 = "Full Unhide Mode On/Off";
//	String Option7 = "POP-UPS On/Off";
//	String Option8 = "Background On/Off";

Frame() {

	mjdbutton1 = new JButton(Option1);
	mjdbutton2 = new JButton(Option2);
	mjdbutton3 = new JButton(Option3);
	mjdbutton4 = new JButton(Option4);

		Border mjdline = new LineBorder(Color.BLUE);
		Border mjdmargin = new EmptyBorder(5, 15, 5, 15);
		Border mjdcompound = new CompoundBorder(mjdline, mjdmargin);	 


		JLabel mjdLabel = new JLabel ();
		JFrame mjdFrame1 = new JFrame();
		
		mjdLabel.setForeground(Color.BLUE);

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
		


		mjdbutton1.setVisible(true); 
		mjdbutton1.setBounds(10, 10, 200, 40);
		mjdbutton1.addActionListener(this);
		
		mjdbutton2.setVisible(true); 
		mjdbutton2.setBounds(230, 10, 200, 40);
		mjdbutton2.addActionListener(this);
		
		mjdbutton3.setVisible(true); 
		mjdbutton3.setBounds(230, 60, 200, 40);
		mjdbutton3.addActionListener(this);
		
		mjdbutton4.setVisible(true); 
		mjdbutton4.setBounds(10, 60, 200, 40);
		mjdbutton4.addActionListener(this);

		mjdFrame1.setLayout(null);
		mjdFrame1.setResizable(false);
		mjdFrame1.setVisible(true);
		mjdFrame1.setTitle("Settings"); 
		mjdFrame1.setSize(460,155);
//		mjdFrame1.add(mjdLabel);
		mjdFrame1.add(mjdbutton1);
		mjdFrame1.add(mjdbutton2);
	    mjdFrame1.add(mjdbutton3);
		mjdFrame1.add(mjdbutton4);
//		mjdFrame1.add(mjdbutton5);
//		mjdFrame1.add(mjdbutton6);
//	    mjdFrame1.add(mjdbutton7);
//		mjdFrame1.add(mjdbutton8);
		mjdFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
	}

public static void main(String[] args){
	new Frame();
	 }

	@Override
	public void actionPerformed (ActionEvent e) {		
		
		if(e.getSource()==mjdbutton1) {
			
            try {
            	mjd.mjdbutton3M.setVisible(true);
            	mjd.mjdbutton3M.setEnabled(true);
       			JOptionPane.showMessageDialog(null, "Button C Added");

         	  } catch (Exception ex) {
         	    ex.printStackTrace();
         	  }
		}
		if(e.getSource()==mjdbutton2) {
           
            try {
          	
            	mjd.mjdbutton3M.setVisible(false);
            	mjd.mjdbutton3M.setEnabled(false);
       			JOptionPane.showMessageDialog(null, "Button C Removed");
          	  } catch (Exception ex) {
          	    ex.printStackTrace();
          	  }

		}

		if(e.getSource()==mjdbutton3) {
            try {
            	new URLupdate();
    			
//    			JOptionPane.showMessageDialog(null, "Under development.. \nThank you for your patience");

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
		}
	}
