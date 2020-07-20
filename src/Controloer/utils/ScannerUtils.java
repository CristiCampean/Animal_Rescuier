package Controloer.utils;

import java.util.Scanner;

public class ScannerUtils {
     public static final Scanner SCANNER = new Scanner(System.in);
     public static String ReadScannerString(){
         String string = SCANNER.next();
         SCANNER.nextLine();
         return string;
     }
     public static int ReadScannerInt(){
         int integer = SCANNER.nextInt();
         SCANNER.nextLine();
         return integer;
     }
}
