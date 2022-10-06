package thegreatest.zadanie4_4_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class BigLetter {
    private String typo;

    protected BigLetter(String typo) {
        this.typo = typo;
    }

    protected String sizeOfLetterIsBeingChanged() {
        if (getAllBigLetters().contains(typo.charAt(0))) {
            return String.valueOf(typo.charAt(0)).toLowerCase() + typo.substring(1);
        }
        else {
            return String.valueOf(typo.charAt(0)).toUpperCase() + typo.substring(1);
        }
    }

    private List<Character> getAllBigLetters() {
        List<Character> listOfLetters = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            listOfLetters.add(i);
        }
        return  listOfLetters;
    }
}
