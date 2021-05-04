package Mjd_New;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class notify {
	static String URL1;
	static String URL2;
	static String URL3;
	static String URL4;
	static String URL5;
	static String URL6;
	static String URL7;
	static String URL8;
	static String URL9;
		notify() throws IOException {
		    final File URLsFile = new File(".URLS");

		    if(!URLsFile.exists()) {
		    	JOptionPane.showMessageDialog(null, "1- Edit the Packages by clicking the setting button in the lower right corner \n2-If nothing please leave empty \n3- Please type WITHOUT HTTP or WWW \n4- To skip just click Enter ", "Important Message", JOptionPane.INFORMATION_MESSAGE);
				URL1 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 1: "));
				URL2 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 1: "));
				URL3 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 1: "));
				URL4 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 2: "));
				URL5 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 2: "));
				URL6 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 2: "));
				URL7 = ("https://" + JOptionPane.showInputDialog("Please type URL 1 for package 3: "));
				URL8 = ("https://" + JOptionPane.showInputDialog("Please type URL 2 for package 3: "));
				URL9 = ("https://" + JOptionPane.showInputDialog("Please type URL 3 for package 3: "));
//				
//		        URLS.write("URL 1 for package 1 is: " + URL1);
//		        URLS.write("\nURL 2 for package 1 is: " + URL2);    
//		        URLS.write("\nURL 3 for package 1 is: " + URL3);
//		        URLS.write("\nURL 1 for package 2 is: " + URL4);
//		        URLS.write("\nURL 2 for package 2 is: " + URL5);    
//		        URLS.write("\nURL 3 for package 2 is: " + URL6);
//		        URLS.write("\nURL 1 for package 3 is: " + URL7);
//		        URLS.write("\nURL 2 for package 3 is: " + URL8);    
//		        URLS.write("\nURL 3 for package 3 is: " + URL9);
//		        URLS.close();
//				
				URLsFile.createNewFile();
		        FileWriter URLS =new FileWriter("C:\\Users\\syfal\\Desktop\\URLS.tx t");    
		        URLS.write(URL1);
		        URLS.write(URL2);    
		        URLS.write(URL3);
		        URLS.write(URL4);
		        URLS.write(URL5);    
		        URLS.write(URL6);
		        URLS.write(URL7);
		        URLS.write(URL8);    
		        URLS.write(URL9);
		        URLS.close();
		    }
		}
		

		public static void main(String[] args) throws IOException{
			new notify();
		}

}
