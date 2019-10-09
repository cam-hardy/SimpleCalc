/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fitnesseexample;

/**
 *
 * @author CamDH
 */
import java.lang.IllegalArgumentException;


public class SimpleCalc {
    private double first, second;
    
    public void setFirst(double first) {
        this.first = first;
    }
    
    public void setSecond(double second) {
        this.second = second;
    }
    
    //returns the sum of 2 numbers
    public double sum() {
        return first+second;
    }
    
    //returns the difference of 2 numbers
    public double diff() {
        return first-second;
    }
    
    //returns the division a by b, throws exception for division by 0
    public double quotient() throws IllegalArgumentException {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        else {
            return first/second;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
