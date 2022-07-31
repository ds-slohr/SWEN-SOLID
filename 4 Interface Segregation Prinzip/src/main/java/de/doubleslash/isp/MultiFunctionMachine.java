package de.doubleslash.isp;

import java.util.Arrays;

public class MultiFunctionMachine implements IPrinter, IScanner, IFax {

  @Override
  public void print(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Print with Multifunctional the text from the document: " + d.getName()));
  }

  @Override
  public void scan(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Scan with Multifunctional the text of the document: " + d.getName()));
  }

  @Override
  public void internetFax(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Fax with Multifunctional the text from the document: " + d.getName()));
  }
}
