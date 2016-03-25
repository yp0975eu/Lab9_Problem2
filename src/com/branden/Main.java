package com.branden;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // to hold snakes
        LinkedList<Snake> snakes = new LinkedList<>();

        // add snakes
        snakes.add(new Snake("Rattlesnake", 4));
        snakes.add(new Snake("Sea Snake", 9));
        snakes.add(new Snake("Green Mamba", 9));
        snakes.add(new Snake("Cobra", 5));
        snakes.add(new Snake("Boa Constrictor", 0));

        Collections.sort(snakes);

        System.out.println(snakes);
    }
}
