package de.doubleslash.lsp;

public class Rectangle {

  private int width;
  private int height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  int getArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Figure(" +
        "width=" + width +
        ", height=" + height +
        ')';
  }
}
