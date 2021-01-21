package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Test", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Another Test", (text -> text.toLowerCase()));
        poemBeautifier.beautify("another test", (text -> "My " + text + " ;)"));
        poemBeautifier.beautify("Bhe Best", (text -> text.replace("B", "T")));
    }
}