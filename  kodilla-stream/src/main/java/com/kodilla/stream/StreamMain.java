package com.kodilla.stream;
import java.util.stream.*;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("First poem text", (text -> text + " on lambdas"));
        poemBeautifier.beautify("Second poem text ", (text -> text.toUpperCase()));
        poemBeautifier.beautify("3rd stupid poem text ", (text -> text.substring(0, 1).toLowerCase() + text.substring(2).toUpperCase()));
        poemBeautifier.beautify("4th amazing poem", (text -> text.substring(2)));
        poemBeautifier.beautify("Last poem ", (text -> "The greatest" + text.substring(1)));


        PoemDecorator bigLetter = (String text) -> (text + text);

        System.out.println(bigLetter.decorate("Testowy text 1"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}