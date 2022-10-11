package thegreatest.barteczko1_2;

class Calculator {
   private final double numeration1;
   private final double numeration2;

   Calculator(double numeration1, double numeration2) {
        this.numeration1 = numeration1;
        this.numeration2 = numeration2;
    }
    protected double addNumbers() {
       return numeration1 + numeration2;
    }
    protected  double subtractNumbers() {
       return numeration1 - numeration2;
    }
    protected double multiplicationNumbers() {
       return  numeration1 * numeration2;
    }
    protected double dividingNumbers() {
       double result = 0.0;
       try {
           result = numeration1 / numeration2;
       }
       catch (ArithmeticException a) {
           System.out.println(a.getMessage());
       }
       return result;
    }
}
