package de.doubleslash.isp;

import java.util.Arrays;

public class Scanner implements IScanner {

  public void scan(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Scan with Scanner the text from the document: " + d.getName()));
  }
}
