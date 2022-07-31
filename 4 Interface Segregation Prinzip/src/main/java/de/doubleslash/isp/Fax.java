package de.doubleslash.isp;

import java.util.Arrays;

public class Fax implements IFax {

  @Override
  public void internetFax(Document... documents) {
    Arrays.stream(documents)
        .forEach(d -> System.out.println("Fax with Fax the text from the document: " + d.getName()));
  }
}
