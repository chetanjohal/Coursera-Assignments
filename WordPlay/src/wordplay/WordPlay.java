/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordplay;

import java.util.Scanner;

/**
 *
 * @author chetanjohal
 */
public class WordPlay {

    public static boolean isVowel(char ch) {
        char x = Character.toLowerCase(ch);

        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static StringBuilder replaceVowels(String phrase, char ch) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char a = phrase.charAt(i);
            if (isVowel(a) == true) {
                sb.insert(i, ch);
            } else {
                sb.insert(i, a);
            }
        }
        System.out.println(sb);
        return sb;

    }
    
    public static StringBuilder emphasis(String phrase, char ch) {
        
        StringBuilder sb = new StringBuilder();
        char x = Character.toLowerCase(ch);
        for(int i =0; i < phrase.length(); i++ ) {
           char b = phrase.charAt(i) ;
           char c = Character.toLowerCase(b);
           if(i%2==0 && x == c) {
               sb.insert(i, '*');
           } else if(i%2 == 1 && x == c) {
               sb.insert(i, '+');
           } else {
               sb.insert(i, b);
           }   
        }
        System.out.println(sb);
        return sb;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here

        replaceVowels("HelloWorld !", '*');
        emphasis("Mary Bella Abracadabra", 'a');
    }

}
