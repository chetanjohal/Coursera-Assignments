/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

/**
 *
 * @author chetanjohal
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static String encrypt(String input, int key) {

        String alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabetU = alphabetU.substring(key) + alphabetU.substring(0, key);
        String shiftedAlphabetL = alphabetL.substring(key) + alphabetL.substring(0, key);

        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            if (Character.isUpperCase(ch) == true) {
                int index = alphabetU.indexOf(ch);
                if (index != -1) {
                    char currchar = shiftedAlphabetU.charAt(index);
                    encrypted.setCharAt(i, currchar);
                }

            } else {
                int index = alphabetL.indexOf(ch);
                if (index != -1) {
                    char currchar = shiftedAlphabetL.charAt(index);
                    encrypted.setCharAt(i, currchar);
                }
            }
        }
        System.out.println(encrypted);
        return encrypted.toString();
    }

    public static String encryptTwoKeys(String input, int key1, int key2) {

        String alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabetU1 = alphabetU.substring(key1) + alphabetU.substring(0, key1);
        String shiftedAlphabetL1 = alphabetL.substring(key1) + alphabetL.substring(0, key1);

        String shiftedAlphabetU2 = alphabetU.substring(key2) + alphabetU.substring(0, key2);
        String shiftedAlphabetL2 = alphabetL.substring(key2) + alphabetL.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            if (Character.isUpperCase(ch) == true) {
                int index = alphabetU.indexOf(ch);
                if (index != -1 && i % 2 == 0) {
                    char currchar = shiftedAlphabetU1.charAt(index);
                    encrypted.setCharAt(i, currchar);
                } else if (index != -1 && i % 2 == 1) {

                    char currchar = shiftedAlphabetU2.charAt(index);
                    encrypted.setCharAt(i, currchar);
                }

            } else {
                int index = alphabetL.indexOf(ch);
                if (index != -1 && i % 2 == 0) {
                    char currchar = shiftedAlphabetL1.charAt(index);
                    encrypted.setCharAt(i, currchar);
                } else if (index != -1 && i % 2 == 1) {

                    char currchar = shiftedAlphabetL2.charAt(index);
                    encrypted.setCharAt(i, currchar);
                }
            }
        }
        System.out.println(encrypted);
        return encrypted.toString();

    }

    public static void main(String[] args) {
        // TODO code application logic here

        encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15);
    }

}
