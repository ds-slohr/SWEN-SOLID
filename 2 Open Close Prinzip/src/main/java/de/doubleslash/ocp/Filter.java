package de.doubleslash.ocp;

import java.util.List;
import java.util.stream.Stream;

public class Filter<T> {
    public Stream<T> filter(List<T> items, Specification<T> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}
