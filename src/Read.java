import java.io.*;
import java.util.*;
import javax.swing.*;


public class Read

{
    
    String file1;
    
    public String name[];
    
    public Scanner a;
    
    public void Open()
    
    {
        
        file1 = JOptionPane.showInputDialog("Enter the file name:");
        
        
        
        try (FileReader a= new FileReader(file1))
        
        {
            System.out.println("File found");
            
            int y = a.read();
            while(a.ready()){
                System.out.print((char) y);
                y = a.read();
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
    
    public static void main(String[] args){
        Read newfile = new Read();
        newfile.Open();
    }
}


