/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.networkingclass1;

import java.io.BufferedReader;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class Networkingclass1 {
    public static void main(String[] args) throws  IOException{
     URL url = new URL("https://jsonplaceholder.typicode.com/posts");
     HttpURLConnection con = (HttpURLConnection)url.openConnection();
     con.setRequestMethod("GET");
     con.setRequestProperty("User-Agent", "Chrome");
     int response = con.getResponseCode();
     System.out.println("Response Code = "+response);
     System.out.println("Response Message = "+con.getResponseMessage());
    
     if(response == 200){
     BufferedReader read = new BufferedReader(new InputStreamReader(con.getInputStream()));
         StringBuffer str = new StringBuffer();
         
         String data = null;
         while ((data = read.readLine())!= null){
         str.append(data);
             
         }
         System.out.println("All Response ="+str.toString());
     }
     
    }
}
