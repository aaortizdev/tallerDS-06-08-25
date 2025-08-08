package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Choice {
    
    public abstract boolean winsAgainst(Choice other);
    
    private static final List<Choice> CHOICES = Arrays.asList(
        new Rock(),
        new Paper(), 
        new Scissors()
    );
    
    private static final Random random = new Random();
    
    public static Choice randomChoice() {
        return CHOICES.get(random.nextInt(CHOICES.size()));
    }
    
    @Override
    public abstract String toString();
}
