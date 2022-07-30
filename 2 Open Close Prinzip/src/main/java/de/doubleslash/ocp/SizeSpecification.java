package de.doubleslash.ocp;

public class SizeSpecification implements Specification<Product>{

    private final Size size;

    SizeSpecification(Size size) {
        this.size = size;
    }

    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}
