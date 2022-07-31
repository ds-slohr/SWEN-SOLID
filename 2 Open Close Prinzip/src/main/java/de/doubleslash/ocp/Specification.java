package de.doubleslash.ocp;

public interface Specification<T> {

  boolean isSatisfied(T item);
}
