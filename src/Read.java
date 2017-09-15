

import java.io.*;
import java.util.*;
import javax.swing.*;


public static void main(String[] args)
{
    Read newFile = new Read;
    newFile.Open;
        }

public class Read
{
String file1;
public String name[];

public Scanner a;

public void Open()
{
file1 = jOptionPane.showInputDialog("Enter the file name:");


try
{
Scanner a= new Scanner(new File(file1));
System.out.println("File found");
}

   catch(FileNotFoundExecption exception)
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
   while(a.Next != null) 
   {
    name[x] = a.Next();
    x++;ls
    
    a.close;
   }


}


}
