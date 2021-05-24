package com.Ayoub;

import java.util.ArrayList;
import java.util.Random;

public class RandomLetters {
    Random r = new Random();
    ArrayList<Character> c = new ArrayList<>();

    public RandomLetters(){
    }

    public void generateLetters(){
        for (int i = 0; i < 5; i++){
            c.add((char)(r.nextInt(26) + 'a'));
        }

    }

    public ArrayList<Character> getLetters(){
        return this.c;
    }

    public void sort(){
        System.out.println("Initial arrayList: " + this.c + "\n");
        boolean sorted = false;

        // loop until ArrayList is sorted
        while (!sorted){
            boolean sorting = false;
            for (int i = 0; i < c.size()-1; i++){
                Character letter0 = c.get(i);
                Character letter1 = c.get(i + 1);

                // compare characters in ArrayList with ones next to each other
                // if char on it's right is lower, they're swapped
                if (letter0 > letter1) {

                    // boolean to keep track whether we're still sorting the ArrayList
                    sorting = true;
                    Character oldLetter = c.get(i);
                    c.set(i, c.get(i + 1));
                    c.set(i + 1, oldLetter);
                    System.out.println(this.c);
                }
            }
            // continue while loop if we're still sorting
            // if we haven't sorted in last attempt, end while loop
            if (!sorting){
                sorted = true;
            }
        }
    }

}
