package project.operations.util;

import project.model.ComplexNumber;
import project.operations.ComplexOperations;

public class Division implements  ComplexOperations{

    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double denom = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denom;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denom;
        return new ComplexNumber(realPart, imaginaryPart);
    }
  

}
