package com.Ayoub;


public class Sorter {
    String[] a;

    public Sorter (String[] alphabet){
        this.a = alphabet;
    }

    public String[] getA() {
        return this.a;
    }

    public String[] sort(String[] a){
        for (int i = 0; i < a.length-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j].compareTo(a[minIndex]) >= 0){
                    System.out.println("Greater");
                    minIndex = j;
                }
//                else if(a[j].compareTo(a[minIndex]) >= 0){
//                    minIndex = a;
//                }
            }
            String temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println(toString(a[0]));
        return a;
    }

    public String toString(String b){
        return b;
    }
}

