package de.doubleslash.isp;

public class FaxPanasonic implements Fax {

  public void InternetFax(Document d) {
    System.out.println("Fax the text from the document: " + d);
  }
}
