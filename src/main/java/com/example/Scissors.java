package com.example;

public class Scissors extends Choice {
    
    @Override
    public boolean winsAgainst(Choice other) {
        return other instanceof Paper;
    }
    
    @Override
    public String toString() {
        return "SCISSORS";
    }
}
