package com.yuu6.helloWorld.structurlaPattern.compositePattern;

public class Main {
    public static void main(String[] args) {

        Word word = new Word();
        word.addChar(new UpperChar('H'));
        word.addChar(new LowerChar('E'));
        word.addChar(new UpperChar('L'));
        word.addChar(new LowerChar('L'));
        word.addChar(new UpperChar('O'));

        word.addChar(new UpperChar(' '));

        word.addChar(new UpperChar('W'));
        word.addChar(new LowerChar('O'));
        word.addChar(new UpperChar('R'));
        word.addChar(new LowerChar('L'));
        word.addChar(new UpperChar('D'));

        word.addChar(new UpperChar('!'));

        word.say();

        UpperChar upperChar = new UpperChar('a');
        upperChar.say();

    }
}
