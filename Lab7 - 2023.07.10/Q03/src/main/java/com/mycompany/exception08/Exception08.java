package com.mycompany.exception08;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception08 
{
    public static void main(String[] args)
    {
        try
        {
           //specify the path of the file
            String filePath = "path/to/nonexistent/file.txt";
            //create a file object
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
                sc.close();
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Error: File not found");
            e.printStackTrace();
        }
    }
}
