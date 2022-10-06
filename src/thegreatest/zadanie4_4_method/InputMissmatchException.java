package thegreatest.zadanie4_4_method;

class InputMissmatchException extends RuntimeException {
    private static final String MESSAGE = "Enter only letters because invalid sign: %s";

    InputMissmatchException(char invalidChar) {
        super(String.format(MESSAGE, invalidChar));
    }
}
