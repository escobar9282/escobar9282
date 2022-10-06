package thegreatest.zadanie5_2;

public class Main {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Smith";
        Person person = new Person(firstName, lastName);

        System.out.println(person.firstCases());

        System.out.println(person.companyName());

        System.out.println(person.bigLettersSmallLetters());
    }
}
