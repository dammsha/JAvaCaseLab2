package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vector vector1 = new Vector(new ArrayList<>(List.of(3.0, 4.0, 0.0)));
        Vector vector2 = new Vector(new ArrayList<>(List.of(1.0, 1.0, 1.0)));

        vector1.start(vector2);

        Vector.generateVectors(5);
    }
}