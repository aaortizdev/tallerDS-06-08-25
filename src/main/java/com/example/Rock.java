package com.example;

public class Rock extends Choice {
    
    @Override
    public boolean winsAgainst(Choice other) {
        return other instanceof Scissors;
    }
    
    @Override
    public String toString() {
        return "ROCK";
    }
}