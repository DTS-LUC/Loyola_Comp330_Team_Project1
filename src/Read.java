import java.io.*;
import java.util.*;
import javax.swing.*;


public class Read

{
    
    public String file1;
    
    public String name[];
    
    public Scanner a;
    
   
    
    public void Open()
    
    {
        
       file1 = JOptionPane.showInputDialog("Enter the file name: (Enter x to exit)");
     
       if (file1 == "x")
       {
       System.exit(0);	
       }
        
       int i=0;
       int[] word = new int[100];
        
       try (FileReader a= new FileReader(file1))
        
        {
            System.out.println("\nFile found");

            int y = a.read();   // Reads line in ASCII 
           
            while(a.ready())
            {
             
           	word[i]= y;  // Stored as int
            System.out.print((char)word[i]); // Prints as char
            i++;
            
            y = a.read(); // Read next line
                
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
        
    }
    
    public static void main(String[] args)
    {
    	String files;
 
        Read newfile= new Read();
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
