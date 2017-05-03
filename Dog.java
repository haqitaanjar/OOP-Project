/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Dog extends GameObject{
    
    Dog D = new Dog();
    
    public void setSummon(int summonPlaceX, int summonPlaceY){
        D.summonPlaceX = 10; //sementara
        D.summonPlaceY = 10;
    }
    
    @Override
    public void setInteract(Map m){
        if (m instanceof Rock){
            D.move = 0; //sementara
        }
        else if(m instanceof Farmer){
            D.move = 0;
        }
    }
    
    @Override
    public void setMove(int move){
        if (move < 0){
            D.move = D.move--;
        }
        else if (move > 0){
            D.move = D.move++;
        }
    }  
}
