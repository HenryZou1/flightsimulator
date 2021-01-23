/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author HENRY
 */
abstract class Passenger {
    private String name;
    private int age;
    public Passenger(String n, int a){
        name = n;
        age = a;
    }
    public String getName(){
        return(name);
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return (age);
    }
    public void setAge(int a){
        age = a;
    }
    abstract double applyDiscount(double p);
}
