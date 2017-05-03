/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DogWatcher {
    Dog D = new Dog();
    
    ArrayList<Dog> Dog = new ArrayList<>();
    
    public void interactHole(Hole H){
        D.amount = D.amount--;
        Dog.remove(0);
    }
    
    public void setSummon(int summonPlaceX, int summonPlaceY){
        D.summonPlaceX = 0;
        D.summonPlaceY = 0;
    }
    
    public boolean checkDogAmount(){
        if(D.amount<3){
            return true;
        }
        return true;
    }
}
