package eureka;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

	FileInputStream filestream = new FileInputStream("C:\\Users\\Nickhil\\Desktop\\Test.txt");
	DataInputStream dis = new DataInputStream(filestream);
	BufferedReader br = new BufferedReader(new InputStreamReader(dis));
	//System.out.println(br.readLine());
	String line2;
	while((line2=br.readLine())!=null)
	{
		String[] line = new String[20];
		line = line2.split(" ");
		for(String s:line)
			System.out.println(s);
		
	}
	}

}
