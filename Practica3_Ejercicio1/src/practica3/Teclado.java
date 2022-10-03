/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;
import java.io.*;


/**
 *
 * @author danic
 */
public class Teclado {
    
    public static String LeerCadena(){
        BufferedReader br = new BufferedReader(new InputStreamReader
        (System.in));
        String str;
        try {
            str = br.readLine();
        }
        catch (IOException e){
            str = "";
        }
        return str;
    }
    
    public static int LeerEntero(){
        int num;
        try {
            num = Integer.parseInt(LeerCadena().trim());
        }
        catch (NumberFormatException e){
            num = 0;
        }
        return num;
    }
}