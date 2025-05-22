/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear1;

public class Leapyear1 {
    public static void main(String[] args) {
        int year=2005;
        if(year%4==0){
           System.out.print(year+" is a leap year");
        }
        else{
            System.out.println (year+" not a leap year");
        }
    }
    
}
