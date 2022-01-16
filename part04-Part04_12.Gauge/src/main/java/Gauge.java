/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duncan
 */
public class Gauge {
    private int value;
    
    public Gauge(){
        this.value = 0;
    }
    
    public void increase(){
        if(value <  5){
            value++;            
        }// end of if statement
    }// end of increase method
    
    public void decrease(){
        if(value > 0 ){
            value--;
        }// end of if statement
    }// end of decrease method
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        return this.value == 5;
    }
}
