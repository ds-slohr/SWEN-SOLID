package de.doubleslash.isp;

import java.util.Arrays;

class Photocopier implements IPrinter, IScanner {

  @Override
  public void print(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Print with Photocopier the text from the document: " + d.getName()));
  }

  @Override
  public void scan(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Scan with Photocopier the text of the document: " + d.getName()));
  }
}
