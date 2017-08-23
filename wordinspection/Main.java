package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("txt/shortlist.txt");
        // all words are in file src/wordList.txt
		WordInspection f = new WordInspection(file);
		System.out.println(f.wordCount());
		System.out.println(f.wordsEndingInL());
		System.out.println(f.wordsContainingZ());
		System.out.println(f.palindromes());
		System.out.println(f.wordsWhichContainAllVowels());
    }
}

