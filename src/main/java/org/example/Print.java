package org.example;

public class Print {
    private int value = 10;

    public int printAndReturnFieldValue(){
        System.out.println("---" + value + "---");
        return value;
    }
}
