/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.util.*;



public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String word = console.nextLine();
        
        String piglatin = pigLatinWord(word);
        System.out.println(piglatin);
    }
    
    public static String pigLatinWord (String word) {
        word = word.toLowerCase();
        
        char c = word.charAt(0);
        boolean b = isVowel(c);
        
        if (word.startsWith("th")) {
            String piglatin = word.substring(2) + "-thay";
            return piglatin;            
        } 
        else if (b == true) {
            String piglatin = word + "-way"; 
            return piglatin;
        }
        else {
            String piglatin = word.substring(1) + "-" + word.charAt(0) + "ay";
            return piglatin;
        }
    }
    
    public static boolean isVowel(char c) { 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';    
        
        }
    }
