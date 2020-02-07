package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread {

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("D:\\output.txt", true);
			int s;
			int count=0;
			while ((s = br.read()) != -1)
			{ // read a line
				if(count<10)
				{count++;
				fw.write((char)s); // write to output file
				fw.flush();
				}
				else {
					count=0;
					try {
						Thread.sleep(5000);
						System.out.println ("10 characters copied"); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
