package exceptionTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// open the file
		String fileName = "C:\\Users\\nikit\\file.text";
		String line = null;
		try
		{
			//read a text file
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader (fileReader);
			while((line = bufferedReader.readLine()) !=null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error file"+ fileName +" was not found!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
