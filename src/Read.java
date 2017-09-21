import java.io.*;
import java.util.*;
import javax.swing.*;


public class Read
{
    public static void listFilesForFolder(final File folder) {
      for (final File fileEntry : folder.listFiles()) {
          if (fileEntry.isDirectory()) {
              listFilesForFolder(fileEntry);
          } else {
              System.out.println(fileEntry.getName());
          }
      }
    }

    public static void main(String[] args)
    {
      final File folder = new File("/Users/don/Desktop");
      listFilesForFolder(folder);
    }
}
