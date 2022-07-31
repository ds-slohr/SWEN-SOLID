package de.doubleslash.ocp;

public class ColorSpecification implements Specification<Product> {

  private final Color color;

  ColorSpecification(Color color) {
    this.color = color;
  }

  public boolean isSatisfied(Product p) {
    return p.color == color;
  }
}
