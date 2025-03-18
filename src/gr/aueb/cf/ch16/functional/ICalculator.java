package gr.aueb.cf.ch16.functional;

/**
 * Functional interfaces are interfaces that have exactly one abstract method.
 * They can have only one functionality to exhibit.
 */
@FunctionalInterface
public interface ICalculator {
    int operate(int a, int b);
}
