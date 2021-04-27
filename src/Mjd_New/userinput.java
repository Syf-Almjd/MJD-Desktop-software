package Mjd_New;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class userinput {
	
	void start () {
		String inputByUser;
		
		Scanner in = new Scanner(System.in);
		String savedInput = in.nextLine();
	}


	userinput() throws IOException {
			    final File inputByUser = new File(".launched12341");

			    if(!inputByUser.exists()) {
			    	JOptionPane.showInputDialog("Input your URL");
			    	inputByUser.createNewFile();
			    }
		
		}

	}
