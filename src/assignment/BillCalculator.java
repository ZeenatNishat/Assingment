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
public class BillCalculator {
    public double calculateBasicBill(double unit){
        double bill = 0;
        if(unit<=199)
        {
            bill = unit * 1.2;
            if (bill<=100)bill=100;
        }
        else if (unit>199 && unit<400)
        {
            bill = unit*1.5;
        }
        else if (unit>=400 && unit<600)
        {
            bill= unit*1.6;
        }
        else {
            bill = unit*2;
        }
        return bill;
            
    }
    public double calculateSurcharge(double BasicBill){
        double surcharge = 0;
        if(BasicBill>400)
        {
            surcharge = (BasicBill*1.5)/100;
        }
        return surcharge;
    }
    public double getTotalBill(double unit){
        double totalBill = calculateBasicBill(unit);
        totalBill += calculateSurcharge(totalBill);
        return totalBill;
    }
}

    

