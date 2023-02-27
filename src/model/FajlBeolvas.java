package model;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FajlBeolvas {

    public static void main(String[] args) {
        beolvas();
    }

    public static void beolvas() {
      String fajlnev = "emberek.txt";
       List<String> sorok = Files.readAllLines(Path.of(fajlnev));
       sorok.remove(0);
       return sorok;
              
    }
}
