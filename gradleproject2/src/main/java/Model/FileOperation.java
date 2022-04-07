/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Veiw.*;
import Controller.Invoice;
import static Veiw.NewJFrame.n;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author user
 */
public class FileOperation {
     public static void ReadFile1(String filepath ){
     
        
        
       
       
        
        try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="";                         
        while((s1=br.readLine())!=null){    
        String invioceData[]=  s1.split(",");
        int No =Integer.parseInt(invioceData[0]);
         String Date=invioceData[1];
         String CustomerName=invioceData[2];
         //create object of the first line
        NewJFrame.n.add(new Invoice(No,Date,CustomerName));
          // increase row and id 
          //view in invioce Table after we get 2 files 
         
          
        }    
            
        br.close();    
        }catch (Exception ex) {ex.printStackTrace();  }
        }
     
     public static void ReadFile2(String filepath){
     
     try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="";                         
        while((s1=br.readLine())!=null){    
        String invioceData[]=  s1.split(",");
        int No =Integer.parseInt(invioceData[0]);
         String Name=invioceData[1];
         double Price=Double.parseDouble(invioceData[2]);
         int C =Integer.parseInt(invioceData[3]);
         double totalItem= Price* C;
         // create object of the item 
         n.get(No-1).addinvoceItem(Name, Price, C);
       
        } 
        br.close();    
        }catch (Exception ex) {ex.printStackTrace();  }
     
     
     }
     public static void WriteInvoiceHeader(String filepath){
          try{  
        BufferedWriter br=new  BufferedWriter(new FileWriter(filepath));
        
        // get Data from array with last 
        
       for(int j=0 ;j< n.size();j++){
         // String no=String.valueOf(n[j].InvoiceNo); 
             
            // br.newLine();
        br.append(String.valueOf(n.get(j).InvoiceNo+","+n.get(j).InvoiceDate+","+n.get(j).InvoiceCustomerName));
       
         br.newLine();
       }
        br.close();      
        
        }
        catch (Exception ex) {ex.printStackTrace();} 
       
     }
     public static void WriteInvoiceLine(String filepath){
          try{  
        BufferedWriter br=new  BufferedWriter(new FileWriter(filepath));
        
        // get Data from array with last 
       
       for(int j=0 ;j< n.size();j++){
          
             int x=n.get(j).Noitem;
            // save invoice line;
            for(int k=0 ;k<x ;k++){
        br.append(String.valueOf(n.get(j).InvoiceNo+","+n.get(j).InvoiceItems.get(k).ItemName+","+n.get(j).InvoiceItems.get(k).ItemPrice+","+n.get(j).InvoiceItems.get(k).Count));
        br.newLine();
            }
         
       }
        br.close();      
        
        }
        catch (Exception ex) {ex.printStackTrace();  } 
     }
     
     }
    

