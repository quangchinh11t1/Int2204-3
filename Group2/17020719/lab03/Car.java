/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Admin
 */
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private String getFuel;
    private void horn(){
        System.out.println("Beep!");
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public String getFuel(){
        return getFuel;
    }
    public void setFuel(String getFuel){
        this.getFuel = getFuel;
    }
    public void getInfor(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + maxSpeed);
        System.out.println("Fuel: " + getFuel);
        horn();
    }
}
