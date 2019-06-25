package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {



        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("First poem text", (text -> text + " on lambdas"));
        poemBeautifier.beautify("Second poem text ", (text -> text.toUpperCase()));
        poemBeautifier.beautify("3rd stupid poem text ", (text -> text.substring(0,1).toLowerCase() + text.substring(2).toUpperCase()));
        poemBeautifier.beautify("4th amazing poem", (text -> text.substring(2)));
        poemBeautifier.beautify("Last poem ", (text -> "The greatest" + text.substring(1)));
    }
}
