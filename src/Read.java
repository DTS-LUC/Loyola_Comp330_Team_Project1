
Import java.io.*;
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
(FileReader a= new FileReader(File1));
int y = a.read();
System.out.print(char) y;
y = a.read();

 
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
}
}
