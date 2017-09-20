import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
 

public class Read  
{
    
	
	String files;
   
    String folder,file1;
    
         Desktop desktop = Desktop.getDesktop();
         File folderOpen = null;
        
 String folders()
 {
 	 
 	          folder = JOptionPane.showInputDialog("Enter folder name");
        
        try 
        
        {	
           folderOpen = new File(folder);
            desktop.open(folderOpen);
         
        } 
        
        
        catch (IllegalArgumentException i)
        {
            System.out.println("File Not Found");
        }
       catch(Exception i)
      { 
       System.out.println("Error");   
        } 
  	  
 	  
 	 return null;
 	 
 }
    
    
  String Open()
  {
  	  
  	 
    file1 = JOptionPane.showInputDialog("Enter the directory then file name: (Enter x to exit)", folder + "/");
     
    
    
       if (file1 == "x")
       {
       System.exit(0);	
       }
       
          FileInputStream in= null;
          BufferedReader reader = null;
          String line = null;
          String mline = "";
             
        try { 
             	   
         in = new FileInputStream(file1);
         
         
         reader = new BufferedReader(new InputStreamReader(in));
         
         for (line = reader.readLine(); line != null; line = reader.readLine())
         {      
       
         mline = mline.concat(" " + line);
         }  
           System.out.println(mline); 
         return mline;  
         
            }   
   
         catch(FileNotFoundException e)
         {
          System.out.println("File Not Found1");
         }
        
         catch(Exception e)
         { 
          System.out.println("Error");   
         } 
          return null;
   
   }
    
    public static void main(String[] args)
    {
       String files= "Y";
       
       Read newfile = new Read();
       newfile.folders();
       newfile.Open();
        
       
       while ((files != "N") || (files != "n"))
       {
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
}
