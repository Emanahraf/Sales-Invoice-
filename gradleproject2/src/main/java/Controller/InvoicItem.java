/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author user
 */
public class InvoicItem extends Invoice {
   
    public String ItemName;
    public double ItemPrice;
    public int Count;
    public double ItemTotal ;
     public InvoicItem(){
     
     
     
     }
    public InvoicItem(String ItemName,double ItemPrice,int Count){
    
    
    this.ItemName=ItemName;
    this.ItemPrice=ItemPrice;
    this.Count=Count;
    }
    
      public Double CalcTotalItem(Double p ,int count  ){
     ItemTotal =count * p;
      return ItemTotal;
     }
    
}
