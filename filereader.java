
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class filereader {
    public static void main(String srgs[]) throws FileNotFoundException
    {
        File myObj = new File("vaishi.txt");
        try (Scanner myReader = new Scanner(myObj)) 
        {
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();
        
        }
    }
}
