package codeforAll.fileAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FileAnalyzer {


    public static Long countLines(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .count();
    }


    public static Long countWords(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .count();
    }


    public static Long countNonEmptyLines(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .filter(line -> !line.isEmpty())
                .count();


    }


    public static Long countUniqueWords(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .distinct()
                .count();
    }


    public static Long countSpecificWord(String filePath, String word) throws IOException {

        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .map(String::toLowerCase)
                .filter(words -> words.equals(word.toLowerCase()))
                .count();

    }


    public static long linesContainingWord(String filePath, String word) throws IOException {

        return Files.lines(Paths.get(filePath))
                .filter(line -> line.contains(word))
                .count();

    }


    public static Double averageLineLength(String filePath) throws IOException {

        return Files.lines(Paths.get(filePath))
                .mapToDouble(String::length)
                .average()
                .orElse(0);

    }

    public static Double averageWordLenght(String filePath) throws IOException {

        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .mapToDouble(String::length)
                .average()
                .orElse(0);
    }

    public static String shortestLine(String filePath) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(filePath));

        return lines.stream()
                .filter(line-> !line.isEmpty())
                .min((line1, line2) -> Integer.compare(line1.length(), line2.length()))
                .orElse("");
    }




}



