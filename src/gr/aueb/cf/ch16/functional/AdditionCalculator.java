package gr.aueb.cf.ch16.functional;

public class AdditionCalculator implements ICalculator{

    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
