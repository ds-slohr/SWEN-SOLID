package de.doubleslash.spr;

import java.io.PrintStream;

class Persistence {
    void saveToFile(Object note, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(note.toString());
        }
    }
}
