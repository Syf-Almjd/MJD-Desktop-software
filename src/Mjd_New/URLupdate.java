package Mjd_New;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class URLupdate {

	static String URL1;
	static String URL2;
	static String URL3;
	static String URL4;
	static String URL5;
	static String URL6;
	static String URL7;
	static String URL8;
	static String URL9;
	
		URLupdate() throws IOException {

		    final File URLsFile = new File("C:\\Users\\syfal\\Desktop\\URLS.txt");
//		    if(!URLsFile.exists()) {
//				URLsFile.createNewFile();
//		    }
		    	JOptionPane.showMessageDialog(null, "1- Edit the Packages by clicking the setting button in the lower right corner \n2-If nothing please leave empty \n3- Please type WITHOUT HTTP or WWW \n4- To skip just click Enter or cancel ", "Important Message", JOptionPane.INFORMATION_MESSAGE);
				URL1 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 1: "));
				URL2 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 1: "));
				URL3 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 1: "));
				URL4 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 2: "));
				URL5 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 2: "));
				URL6 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 2: "));
				URL7 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 3: "));
				URL8 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 3: "));
				URL9 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 3: "));
				
				
				
				FileWriter URLS =new FileWriter("C:\\Users\\syfal\\Desktop\\URLS.txt");    
		        URLS.write("\n" + URL1);
		        URLS.write("\n" + URL2);    
		        URLS.write("\n" + URL3);
		        URLS.write("\n" + URL4);
		        URLS.write("\n" + URL5);    
		        URLS.write("\n" + URL6);
		        URLS.write("\n" + URL7);
		        URLS.write("\n" + URL8);    
		        URLS.write("\n" + URL9);
		        URLS.close();

		    }
	

		public static void main(String[] args) throws IOException{
			new URLupdate();
		}
	}


