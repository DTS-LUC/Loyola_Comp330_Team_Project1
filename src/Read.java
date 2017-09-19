import java.io.*;
import java.util.*;
import javax.swing.*;
 

public class Read
{
    
    public String file1;
    public String Open()
    
    {
    file1 = JOptionPane.showInputDialog("Enter the file name: (Enter x to exit)");
     
       if (file1 == "x")
       {
       System.exit(0);	
       }
       
          FileInputStream in= null;
          BufferedReader reader = null;
          String line = null;
             
        try { 
             	   
         in = new FileInputStream(file1);
         
         reader = new BufferedReader(new InputStreamReader(in));
         
         for (line = reader.readLine(); line != null; line = reader.readLine())
         {      
         System.out.println(line);  
         }  
            }   
   
        catch(FileNotFoundException e)
        {
         System.out.println("File Not Found");
        }
        
        catch(Exception e)
        { 
         System.out.println("Error");   
        } 
       return line;    
    }
    
    public static void main(String[] args)
    {
    	String files;
        Read newfile = new Read();
        newfile.Open();
        
        files = JOptionPane.showInputDialog("More Files?  (Y/N)");
     
        if (files.equals("Y") ||  (files.equals("y")))  
        {
        Read newfiles = new Read();
        newfiles.Open();
        }
        
        else if (files.equals("N")  ||  (files.equals("n")) ) 
        {	
        System.exit(0);		
        }
    }
}
