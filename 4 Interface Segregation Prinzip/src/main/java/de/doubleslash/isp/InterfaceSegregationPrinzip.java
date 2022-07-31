package de.doubleslash.isp;

public class InterfaceSegregationPrinzip {

  public static void main(String[] args) throws Exception {

    Document document = new Document();
    document.addDocument("Offer");
    document.addDocument("Invoice");

    PrinterHP printerHP = new PrinterHP();
    printerHP.Print(document);

    ScannerSony scannerSony = new ScannerSony();
    scannerSony.Scan(document);

    PhotocopierHP photocopierHP = new PhotocopierHP();
    photocopierHP.Print(document);

    FaxPanasonic faxPanasonic = new FaxPanasonic();

    MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine(printerHP, scannerSony, faxPanasonic);
    multiFunctionMachine.InternetFax(document);
  }
}




