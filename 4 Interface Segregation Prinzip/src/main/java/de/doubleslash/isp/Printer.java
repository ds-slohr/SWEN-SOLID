package de.doubleslash.isp;

import java.util.Arrays;

public class Printer implements IPrinter {

  @Override
  public void print(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Print with Printer the text from the document: " + d.getName()));
  }
}
