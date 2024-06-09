package codeforAll.fileAnalyzer;

import java.io.IOException;

public class SandBox {

    public static void main(String[] args) {
        String filePath = "src/Resources/Pines.txt";

        try {
            System.out.println("Number of lines in the file: " + FileAnalyzer.countLines(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while counting lines: " + e.getMessage());
        }

        try {
            System.out.println("Number of words in the file: " + FileAnalyzer.countWords(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while counting words: " + e.getMessage());
        }

        try {
            System.out.println("Number of non-empty lines in the file: " + FileAnalyzer.countNonEmptyLines(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while counting non-empty lines: " + e.getMessage());
        }

        try {
            System.out.println("Number of unique words in the file: " + FileAnalyzer.countUniqueWords(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while counting unique words: " + e.getMessage());
        }

        String specificWord = "hours";
        try {
            System.out.println("Number of occurrences of the word '" + specificWord + "': " +
                    FileAnalyzer.countSpecificWord(filePath, specificWord));
        } catch (IOException e) {
            System.err.println("Error occurred while counting occurrences of specific word: " + e.getMessage());
        }

        String wordToFind = "wallet";
        try {
            System.out.println("Number of lines containing the word '" + wordToFind + "': " +
                    FileAnalyzer.linesContainingWord(filePath, wordToFind));
        } catch (IOException e) {
            System.err.println("Error occurred while counting lines containing the word: " + e.getMessage());
        }

        try {
            System.out.println("Average line length: " + FileAnalyzer.averageLineLength(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while calculating average line length: " + e.getMessage());
        }

        try {
            System.out.println("Average word length: " + FileAnalyzer.averageWordLenght(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while calculating average word length: " + e.getMessage());
        }

        try {
            System.out.println("Shortest line in the file: " + FileAnalyzer.shortestLine(filePath));
        } catch (IOException e) {
            System.err.println("Error occurred while finding the shortest line: " + e.getMessage());
        }
    }
}

