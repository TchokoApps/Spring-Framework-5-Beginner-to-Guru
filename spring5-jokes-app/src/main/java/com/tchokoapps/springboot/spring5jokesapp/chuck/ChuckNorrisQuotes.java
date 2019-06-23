package com.tchokoapps.springboot.spring5jokesapp.chuck;

import java.util.Random;

public class ChuckNorrisQuotes {

    private Random random;

    public ChuckNorrisQuotes() {
        random = new Random();
    }

    public String getJoke() {
        return String.valueOf(random.nextInt());
    }
}
