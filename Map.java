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
public interface Map{
    
    ArrayList<GameObject> GO = new ArrayList<>();
    ArrayList<ArrayList<ArrayList<GameObject>>> AM = new ArrayList<>();
    int time = 0;
    
}
