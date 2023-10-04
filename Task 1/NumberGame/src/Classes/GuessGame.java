/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author mohamed
 */
public class GuessGame {
    
    private static int randomNumberGenrator =0;
    
    public static int randomNumber(){
        randomNumberGenrator = (int) Math.round(Math.random()*100);
        return randomNumberGenrator;
    }
    
}
