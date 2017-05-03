/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author ASUS
 */
public class Farmer extends GameObject {
    private int life = 3;
    private int score;
    int x = 0;
    int y = 0;
    
    GameObject GO = new GameObject();
    Farmer F = new Farmer();
    Cherry C = new Cherry();
    Dog D = new Dog();
    Rock R = new Rock();
    Hole H = new Hole();
    
    @Override
    public void setMove(int move){
        if (move < 0){
            F.move = x--;
        }
        
        else if (move > 0){
            F.move = x++;
        }
        
        else if (move < 0){
            F.move = y--;
        }
        
        else if (move > 0){
            F.move = y++;
        }
    }
    
    @Override
    public void setInteract(Map m){
        if (m instanceof Cherry){
            F.score = score++;
        }
        else if (m instanceof Rock){
            F.x = 0;
            F.y = 0;
        }
        else if (m instanceof Hole){
            F.life = 0;
            F.x = 0;
            F.y = 0;
        }
        else if (m instanceof Dog){
            F.life = life--;
            F.x = 0;
            F.y = 0;
        }
    }
    
    public void lifeCondition(int life){
        if (F.life == 0){
            System.out.println("Game Over");
        }
    }
    
    public void setLife(int life){
        F.life = 3;
    }
}
