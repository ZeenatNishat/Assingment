/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author User
 */
public class Task3 {
    public static void main(String[] args){
         BillCalculator bill;
         bill = new BillCalculator();
         System.out.println("Total Bill for 25 units = "+bill.getTotalBill(25));
         System.out.println("Total Bill for 250 units = "+bill.getTotalBill(250));
         System.out.println("Total Bill for 812 units = "+bill.getTotalBill(812));
    }
}

