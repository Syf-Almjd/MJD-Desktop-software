package Mjd_New;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class URLS {
	public static String data;
	public static void main(String[] args) {
	    try {
	      File URLsFile = new File(".URLS");
	      Scanner myReader = new Scanner(URLsFile);
//	      while (myReader.hasNextLine()) {
	        data = myReader.next();
	        
	        
	        System.out.println(data);
//			JOptionPane.showMessageDialog(null,data);
//	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}