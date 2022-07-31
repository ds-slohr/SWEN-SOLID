package de.doubleslash.isp;

public class InterfaceSegregationPrinzip {

  public static void main(String[] args) throws Exception {

    Document offer = new Document("Offer");

    // Printer
    IPrinter printerHP = new Printer();
    printerHP.print(offer);

    IPrinter photocopierHpAsPrinter = new Photocopier();
    photocopierHpAsPrinter.print(offer);

    IPrinter multiAsPrinter = new MultiFunctionMachine();
    multiAsPrinter.print(offer);

    // Scanner
    IScanner scannerSony = new Scanner();
    scannerSony.scan(offer);

    IScanner photocopierHpAsScanner = new Photocopier();
    photocopierHpAsScanner.scan(offer);

    IScanner multiAsScanner = new MultiFunctionMachine();
    multiAsScanner.scan(offer);

    // Fax
    IFax faxPanasonic = new Fax();
    faxPanasonic.internetFax(offer);

    IFax multiAsFax = new MultiFunctionMachine();
    multiAsFax.internetFax(offer);
  }
}




