package com.Ayoub;


public class Main {

    public static void main(String[] args) {
        CreateAlphabet alphabet = new CreateAlphabet();
        alphabet.create();

        System.out.println("Generated alphabet ArrayList:\n" + alphabet.getA() + "\n");

        // create empty char array and fill it with 5 random letters
        RandomLetters letters = new RandomLetters();
        letters.generateLetters();

        // sort letters in ArrayList
        letters.sort();

        System.out.println(letters.getLetters());
    }

}
