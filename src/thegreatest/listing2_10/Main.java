package thegreatest.listing2_10;

public class Main {
    public static void main(String[] args)
    {
        java.util.Set<String> firstNameSet = new java.util.HashSet<>();

        firstNameSet.add("Zofia");
        firstNameSet.add("Katarzyna");
        firstNameSet.add("Grzegorz");
        firstNameSet.add("Tomasz");

        System.out.println("Collection 1: " + firstNameSet + ".");
        System.out.println("Figure of items in collection 1: " + firstNameSet.size() + ".");

        firstNameSet.remove("Grzegorz");
        System.out.println("From collection 1 was removed 1 element - Grzegorz ");
        System.out.println("\nCollection 1: " + firstNameSet);
        System.out.println("Amount of figures in set 1: " + firstNameSet.size() + ".");

        java.util.Set<String> secondaryNameSet = new java.util.HashSet<>();

        secondaryNameSet.add("Aleksander");
        secondaryNameSet.add("Jacek");
        secondaryNameSet.add("Jan");

        System.out.println("\nCollection 2: " + secondaryNameSet);
        System.out.println("Elements in set 2: " + secondaryNameSet.size());

        System.out.println("\nDoes in  collection 2 is Dorota? " + secondaryNameSet.contains("Dorota"));

        firstNameSet.addAll(secondaryNameSet);
        System.out.println("\nAfter adding set 2 to set 1 set 1 includes: " + firstNameSet + ".");

        firstNameSet.removeAll(secondaryNameSet);
        System.out.println("After excluding set 2 from set 1 set 1 includes: " + firstNameSet + ".");

        firstNameSet.retainAll(secondaryNameSet);
        System.out.println("After keeping all collections set 1 " + "and set 2 set 1 includes: " + firstNameSet + ".");
    }
}
/*
Napisz program, który tworzy dwa zbiory haszowane: zbiór1 i zbiór2 do
przechowywania łańcuchów znaków. W naszym przypadku przechowywane będą imiona.
Do zbioru1 dodaj cztery różne imiona i następnie
wydrukuj zawartość tego zbioru. Następnie ze zbioru1 usuń jedno imię
i ponownie wydrukuj zawartość tego zbioru. Utwórz zbiór2 składający się
z trzech imion i sprawdź, czy zawiera on określone imię. Następnie dodaj
zbiór2 do zbioru1. W dalszej kolejności odejmij zbiór2 od zbioru1. Na
koniec znajdź część wspólną obu zbiorów. Ostatnie czynności udokumentuj
 wydrukowaniem zawartości zbiorów zbiór1 i zbiór2
 */