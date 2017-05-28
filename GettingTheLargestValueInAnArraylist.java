/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingthelargestvalueinanarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author kendrabooker
 */
public class GettingTheLargestValueInAnArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        
        do{
        
            Integer num = 1 + r.nextInt(99);
            arr.add(num);
        
        }while(arr.size() < 10);
        
        System.out.println(arr);
        System.out.println("The largest value is "+ Collections.max(arr) + " which is in " + arr.indexOf(Collections.max(arr)));
    }
    
}
