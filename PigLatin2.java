package piglatin2;

import java.io.*;
import java.util.*;


import java.util.Scanner; 
 
public class PigLatin2 {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner stdin = new Scanner(new File("phrases.txt"));
      String original;
      String translated;
      String line;
      String translatedLine = "";
      char firstLetter;
      boolean firstIsCapital = false;
      Scanner latin;
      
      //System.out.print("enter a sentence: ");
      line = stdin.nextLine();
      latin = new Scanner(line);
     
      while (latin.hasNext()) {
         original = latin.next();
        
      
      firstLetter = original.charAt(0);

      // test if the first letter is a capital
      if (Character.isUpperCase(firstLetter)) {
    /* Alternate version that uses char code ordering:
     * if ('A' <= firstLetter && firstLetter <= 'Z') 
     */
        firstLetter = Character.toLowerCase(firstLetter);
        firstIsCapital = true;
      }

      // test whether first letter is a vowel; we know it's lower case now so
      // we don't have to check for capitals.
      if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || 
          firstLetter == 'o' || firstLetter =='u' )  // continuation of long line
      {  // for multi-line conditions, convention says to put { on its own line
        translated = original + "-way";  // for vowels, just add "hay" to the end
      } else {  // first letter is not a vowel
        if (firstIsCapital) {
          translated = "" + Character.toUpperCase(original.charAt(1));
          translated += original.substring(2) + "-" + firstLetter + "ay";
        } else {  // first letter was lower case
          translated = original.substring(1) + "-" + firstLetter + "ay";
        }
      }
     
      translatedLine += translated + " ";
      
      
      
      } // end while loop
      
      System.out.println("in pig latin, it's: " + translatedLine);
      
   }
}