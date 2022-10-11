package thegreatest.barteczko1_2;

enum TypesOfArithmeticsOperations {
ADDING("adding"), SUBTRACTING("subtracting"), MULTIPLICATION("multiplication"), DIVIDING("dividing");

final String type;
    TypesOfArithmeticsOperations(String name) {
        type = name;
    }
}
