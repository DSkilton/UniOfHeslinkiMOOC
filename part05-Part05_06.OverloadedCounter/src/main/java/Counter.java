/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duncan
 */
public class Counter {
    private int value;
    
    public Counter(){
        this.value = 0;
    }
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public int value(){
        return value;
    }
    
    public void increase(){
        value++;
    }
    
    public void increase(int increaseBy){
        if(increaseBy >= 0){
            this.value += increaseBy;
        }
    }
    
    public void decrease(){
        value--;
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            this.value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter{" + "value=" + value + '}';
    }
    
    
}
