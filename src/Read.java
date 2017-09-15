

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


try
{
Scanner a= new Scanner(new File(file1));
System.out.println("File found");
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


public void Read()

{
int x = 0;
   while(a.next() != null)
   {
    name[x] = a.next();
    x++;
   }


}


}
