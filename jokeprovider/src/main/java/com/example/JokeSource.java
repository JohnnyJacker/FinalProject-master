package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeSource {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getRandomJoke() {

        String randomJoke;

        List<String> jokeList = new ArrayList<String>();
        jokeList.add("Why did the pizza maker run from the mafia? \n" + "He owed them a lot of dough!");
        jokeList.add("Where do fish sleep? \n" + "In a water bed!");
        jokeList.add("What did the painting say to the wall? \n" + "I got you covered");
        jokeList.add("How can you make a tissue dance? \n" + "Put a little boogie in it!");
        jokeList.add("Did you hear about the restaurant on the moon? \n" + "Great food, but no atmosphere");
        jokeList.add("What do you call a magin owl? \n" + "Hoodini!");
        jokeList.add("What starts with a 'P', ends with an 'E' and has thousands of letters? \n" + "The Post Office");
        jokeList.add("Why are movies so cool? \n" + "Because they have a lot of fans");
        jokeList.add("Why did the cow cross the road? \n" + "To get to the udder side");
        jokeList.add("What is the moon's favorite gum? \n" + "Orbit!");

        randomJoke = jokeList.get(new Random().nextInt(jokeList.size()));

        return randomJoke;

    }
}
