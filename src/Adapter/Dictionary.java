package Adapter;

import Factory.Word;

public interface Dictionary {
    void addWord(Word word);
    String translate(String englishWord);
}