/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author HENRY
 */
public class NonMember extends Passenger{
    public NonMember(String n, int a){
        super(n,a);
    }
    public double applyDiscount(double p){
        if (getAge()>65)
            p = p*0.9;
        NumberFormat formatter = new DecimalFormat("#0.00");    
        return(Double.parseDouble(formatter.format(p)) );
    }
}
