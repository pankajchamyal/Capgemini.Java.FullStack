package capgemini.firstproject.welcome;

public class FileProgram extends Thread {

	public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("10 characters copied"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
}
