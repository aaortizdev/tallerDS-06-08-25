package com.example;

public class Paper extends Choice {
    
    @Override
    public boolean winsAgainst(Choice other) {
        return other instanceof Rock;
    }
    
    @Override
    public String toString() {
        return "PAPER";
    }
}
