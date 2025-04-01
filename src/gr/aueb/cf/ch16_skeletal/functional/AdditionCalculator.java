package gr.aueb.cf.ch16_skeletal.functional;

public class AdditionCalculator implements ICalculator{

    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
