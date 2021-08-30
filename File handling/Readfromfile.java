package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfromfile {

	public static void main(String[] args) throws IOException  {
		
	//File inputFile=new File("c:\\filehandling\\filess.txt");
	FileReader fr=new FileReader("D:\\file handling.txt");
	int i;
	while((i=fr.read())!=-1)
		System.out.print((char)i);
	fr.close();
	}
}