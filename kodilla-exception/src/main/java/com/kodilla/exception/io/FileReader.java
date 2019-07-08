package com.kodilla.exception.io;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());



        try (Stream<String> fileLines = Files.lines(Paths.get("file/names2.txt"))){
            fileLines.forEach(System.out::println);

        }
        catch (IOException e) {
            System.out.println("coś poszło ne tak" + e);
        }
        finally {
            System.out.println("dzisiaj nastapil rozpad ZSRR");

        }
    }
}