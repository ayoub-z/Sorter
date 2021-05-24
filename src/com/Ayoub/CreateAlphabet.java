package com.Ayoub;

import java.util.ArrayList;

public  class CreateAlphabet {
    ArrayList<Character> a = new ArrayList<>();

    public CreateAlphabet() {
    }

    public ArrayList<Character> getA() {
        return this.a;
    }

    public void create() {

        for (char letter = 'a'; letter <= 'z'; letter++) {
            a.add(letter);
        }
    }
}

