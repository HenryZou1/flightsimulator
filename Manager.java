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
public class Manager {
    static Flight[]  flight=new Flight[3];
    static Ticket[] ticket=new Ticket[100];
    static public void createFlights(){
        flight[0] = new Flight(1,"Toronto","Quebec","07/08/07 8:15pm", 1000,500);
        flight[1] = new Flight(12,"Toronto","New York","07/08/07 8:30pm", 1200,800);
        flight[2] = new Flight(13,"Toronto","New York","07/08/07 8:45pm", 1100,900);
    }
     static public void displayAvailableFlights(String origin, String destination){
        for (int i =0; i<3; i++)
            if(flight[i].getOrigin().equals(origin)&& flight[i].getDestination().equals(destination))
                System.out.println("These are the flights from "+ origin+" to "+destination+flight[i]);
    }
    static public Flight getFlight (int flightNumber){
        int x=-1;
         for (int i =0; i<3; i++)
            if(flight[i].getFlightNumber()==flightNumber)
                x=i;
         if (x == -1)
             throw new IllegalArgumentException("No Flights");
         return(flight[x]);
    }
   static  public void bookSeats(int flightNumber, Passenger p){
        if(getFlight(flightNumber).bookASeat() == true){
            ticket[Ticket.id] = new Ticket(p,getFlight(flightNumber),p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
            System.out.println(ticket[--Ticket.id]);
        }
            
    }
    public static void main(String[] args) {
        createFlights();
        Member p = new Member("John", 65,5);
        Member p1 = new Member("Mary", 35,6);
        NonMember p2 = new NonMember("Steve", 25);
        NonMember p3 = new NonMember("Jane", 66);
        bookSeats(13 ,p);
        bookSeats(12 ,p1);
        bookSeats(1 ,p2);
        bookSeats(12,p3);
        displayAvailableFlights("Toronto", "New York");
    }
    
}
