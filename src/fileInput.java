import jdk.jfr.Frequency;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class fileInput {
    public static void main(String[] args) throws Exception {
        //Reading file
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Encode or Decode a file? \n 1. Encode \n 2.Decode \n 3.Exit");
        System.out.println();
        int b = sc.nextInt();
        sc.nextLine(); //To deal with the nextInt to prevent it from not taking a new line
        if (b == 1) {
            try {
                String a = sc.nextLine();
                //String a = "C:\Users\mohit\OneDrive\Desktop\Compression\test.txt";
                FileReader fr = new FileReader(a);
//                String s = "";
//                int i;
//                while ((i = fr.read()) != -1)
//                    System.out.print((char) i);
//                s += ((char) i);
                huffZipp.beginHzipping(a); ;

            } catch (FileNotFoundException e) {
                System.out.println("Enter a Valid File");

            }
        } else if (b == 2) {
            try {
                String a = sc.nextLine();
                FileReader fr = new FileReader(a);
                huffUnzipp.beginHunzipping(a); ;

            } catch (FileNotFoundException e) {
                System.out.println("Enter a Valid File");
            }
        } else {
            return;
        }
    }
}


