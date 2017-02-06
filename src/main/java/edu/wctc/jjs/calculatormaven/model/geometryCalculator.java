/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jjs.calculatormaven.model;

/**
 *
 * @author Joshua
 */
public class geometryCalculator {
    
    public final double calculateAreaRect(String length,String width) throws NumberFormatException{
       
        try {
            double l = Double.parseDouble( length );
            double w = Double.parseDouble( width );
            double area = l*w;
            return roundTwo(area);
        }catch( NumberFormatException e ) {
            throw new NumberFormatException("Value input was not a number");
        }
        
    }
    public final double calculateAreaCircle(String radius) throws NumberFormatException{
       
        try {
            double r = Double.parseDouble( radius );
            double area = Math.PI*(r*r);
            
            return roundTwo(area);
        }catch( NumberFormatException e ) {
            throw new NumberFormatException("Value input was not a number");
        }
        
    }
     public final double calculateHypotenuse(String sideA,String sideB) throws NumberFormatException{
       
        try {
            
            double a = Double.parseDouble( sideA );
            double b = Double.parseDouble( sideB );
            
            double hypotenuse = Math.sqrt((a*a)+(b*b));
            return roundTwo(hypotenuse);
        }catch( NumberFormatException e ) {
            throw new NumberFormatException("Value input was not a number");
        }
        
    }
    
     public final double roundTwo(double number){
          return Math.round(number * 100.0) / 100.0;
     }
    
    
    
   
    
}
