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
public class Member  extends Passenger{
    private int yearsOfMembership;
    public Member(String n, int a, int y){
        super (n,a);
        yearsOfMembership = y;
    }
    public double applyDiscount(double p){
        if (yearsOfMembership>5)
            p = p *0.5;
        else if (yearsOfMembership>1)
            p = p *0.9;
        NumberFormat formatter = new DecimalFormat("#0.000");    
        return(Double.parseDouble(formatter.format(p)) );
    }
    
}
