package project.operations.util;

import project.model.ComplexNumber;
import project.operations.ComplexOperations;

public class Multiplication implements ComplexOperations {
    
    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double newReal = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double newImaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

}
