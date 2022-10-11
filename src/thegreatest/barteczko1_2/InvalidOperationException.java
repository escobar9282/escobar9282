package thegreatest.barteczko1_2;

class InvalidOperationException extends RuntimeException {
    private static final String MESSAGE = "Only available option is a, b, c, d";

    InvalidOperationException() {
        super(MESSAGE);
    }
}
