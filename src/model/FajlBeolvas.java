package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import view.DolgozokGui;

public class FajlBeolvas {

    public static void main(String[] args) throws IOException {
        beolvas();
    }

    public static ArrayList<Emberek> beolvas() throws IOException {
        Path path = Paths.get("emberek.txt");
        java.util.List<String> sorok = Files.readAllLines(path);
        sorok.remove(0);
        ArrayList<Emberek> dolgozok = new ArrayList<>();

        for (int i = 0; i < sorok.size(); i++) {
            String[] egySor = sorok.get(i).split(";");
                if (egySor.length<= 3) {
               dolgozok.add(new Emberek(egySor[0], Integer.parseInt(egySor[1]), egySor[2], 0));
                } else {
               dolgozok.add(new Emberek(egySor[0], Integer.parseInt(egySor[1]), egySor[2], Integer.parseInt(egySor[3])));
                }
            }
    return dolgozok;
        }

    }

