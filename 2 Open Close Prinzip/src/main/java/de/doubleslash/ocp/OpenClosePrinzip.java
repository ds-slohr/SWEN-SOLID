package de.doubleslash.ocp;

import java.util.List;

public class OpenClosePrinzip {

  public static void main(String[] args) {
    Product apple = new Product("Apple", Color.RED, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);
    Product house = new Product("House", Color.BLUE, Size.LARGE);

    List<Product> products = List.of(apple, tree, house);
    Filter<Product> filter = new Filter<>();

    filter.filter(products, new ColorSpecification(Color.GREEN))
        .forEach(p -> System.out.println(p.name + " is green"));

    filter.filter(products, new SizeSpecification(Size.LARGE))
        .forEach(p -> System.out.println(p.name + " is large"));

    filter.filter(products,
            new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
        .forEach(p -> System.out.println(p.name + " is large and blue"));
  }
}
