package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private String fileName;
	
	public Logger(String fileName) {
		this.fileName = fileName;
	}
	
	public void log(String msg) {
		
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter(fileName,true));
			
			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
		    Date now = new Date();
		    String strDate = sdfDate.format(now);
			
			
			pw.println(strDate+": "+msg);
			pw.close();
<<<<<<< HEAD
			System.out.println("försöker logga");
=======
			//System.out.println("försöker logga");
>>>>>>> 79dcf206b2fea35b57fcbfa20cc88ecacd075541
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
