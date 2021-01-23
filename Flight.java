/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightBooking;

/**
 *
 * @author HENRY
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    public Flight(int f, String o, String d, String dT, int c,double op) throws IllegalArgumentException{
        flightNumber = f;
        if (o ==d)
            throw new IllegalArgumentException();
        origin = o;
        destination = d;
        departureTime = dT;
        capacity = c;
        numberOfSeatsLeft = c;
        originalPrice = op;
    }
    public int getFlightNumber(){
        return(flightNumber);
    }
    public void setFlightNumber(int n){
        flightNumber =n;
    }
    public String getOrigin(){
        return(origin);
    }
    public void setOrigin(String o){
        origin =o;
    }
    public String getDestination(){
        return(destination);
    }
    public void setDestination(String d){
        destination =d;
    }
    public String getDepartureTime(){
        return(departureTime);
    }
    public void setDepartureTime(String d){
        departureTime =d;
    }
    public int getCapacity(){
        return(capacity);
    }
    public void setCapacity(int c){
        capacity = c;
    }
    public int getNumberOfSeatsLeft(){
        return(numberOfSeatsLeft);
    }
    public void setNumberOfSeatsLeft(int i){
        numberOfSeatsLeft = i;
    }
    public double getOriginalPrice(){
        return(originalPrice);
    }
    public void setOriginalPrice(double o){
        originalPrice = o;
    }
    public boolean bookASeat(){
        if (getNumberOfSeatsLeft()>0){
            setNumberOfSeatsLeft(numberOfSeatsLeft--);
            return(true);
        }
        return(false);    
    }
    public String toString(){
        return("Flight " + flightNumber + ", " + origin+ " to " + destination + ", " + departureTime + ", original price:" + originalPrice+ "$");
    }
         
}
