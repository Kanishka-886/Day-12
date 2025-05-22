/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;


public class Number {
    public static void main(String[] args) {
        int x=25;
        int y=22;
        int z=34;
        if(x>y&&x>z){
            System.out.println("x is largest number");
        }
        else if(y>x&&y>z){
            System.out.println("y is largest number");
        }
        else{
            System.out.println("z is largest number");
        }
        
    }
    
}
