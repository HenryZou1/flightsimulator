/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

import flightBooking.Flight;




/**
 *
 * @author HENRY
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    public static int id=1;
    public Ticket(Passenger p, Flight f, double pr){
        passenger= p;
        flight=f;
        price = pr;
        number =id;
        id++;
    }
    public Passenger getPassenger(Passenger p){
        return p;
    }
    public void setPassenger(Passenger p){
        passenger =p;
    }
    public Flight getFlight(Flight f){
        return f;
    }
    public void setFlight(Flight f){
        flight =f;
    }
     public double getPrice(Double p){
        return p;
    }
    public void setPrice(Double p){
        price =p;
    }
  public String toString(){
        return(passenger.getName() +", " + flight + ", ticket price:" +price);
    }

}
