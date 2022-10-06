package thegreatest.zadanie5_2;

import java.util.Locale;

class Person {
    private final String firstName;
    private final String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected String bigLettersSmallLetters() {
        return lastName.toUpperCase() + " " + firstName;
    }
    protected String firstCases() {
        return String.valueOf(firstName.charAt(0)).toUpperCase() + String.valueOf(lastName.charAt(0)).toUpperCase();
    }
    protected String companyName() {
        return lastName.substring(0, 2).toUpperCase() + firstName.substring(0, 3).toLowerCase();
    }
}
