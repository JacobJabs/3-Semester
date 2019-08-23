/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jacob
 */
public class Animal {
    
    public String type; 
    public int birthy; 
    public String sound; 

    public Animal(String type, int birthy, String sound) {
        this.type = type;
        this.birthy = birthy;
        this.sound = sound;
    }

    public Animal() {
    }
    
    
    
}
