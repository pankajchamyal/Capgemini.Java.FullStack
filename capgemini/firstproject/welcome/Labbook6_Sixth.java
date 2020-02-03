package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Labbook6_Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\testout.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String i;
		int Lno = 0;
		BufferedReader br = new BufferedReader(fr);
		int words=0;
		int chars=0;
		try {
			while ((i = br.readLine()) != null) {
				StringTokenizer st= new StringTokenizer(i);
				words=words+st.countTokens();
				chars=chars+i.length();
				Lno++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Lines-> "+Lno+" Words-> "+words+" Characters-> "+chars);
	}

}
