package de.doubleslash.spr;

import java.util.ArrayList;
import java.util.List;

class Note {

  private static int count = 0;
  private final List<String> comments = new ArrayList<>();

  void addComment(String text) {
    comments.add("" + (++count) + ": " + text);
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), comments);
  }
}
