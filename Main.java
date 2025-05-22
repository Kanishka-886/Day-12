/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;
class Add{
     static boolean adder(boolean p){
        return  p;
    }
     
    
    static double adder(double p,double q,double r){
        return  p+q+r;
    }
    static float adder(float p,float q,float r,float s){
        return p+q+r+s;
    }
    
    
}

/**
 *
 * @author H.PRADEESH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Add.adder(true));
        
        System.out.println(Add.adder(2344,13874,3498));
        System.out.println(Add.adder(234,138,346,249));
        
        
        
        // TODO code application logic here
    }
    
}
