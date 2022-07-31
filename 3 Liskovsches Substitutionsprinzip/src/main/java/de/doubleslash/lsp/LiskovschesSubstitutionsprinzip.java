package de.doubleslash.lsp;

public class LiskovschesSubstitutionsprinzip {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 4);
    Rectangle square = new Square(4);

    showArea(rectangle);
    showArea(square);
  }

  private static void showArea(Rectangle figure) {
    System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
  }
}
