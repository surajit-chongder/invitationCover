package design;

import entities.Person;

import java.util.ArrayList;
import java.util.List;

public class CoverDecorator {
    private final Person person;
    private final String method;

    public CoverDecorator(Person person, String method) {
        this.person = person;
        this.method = method;
    }

    public List<String> decoration() {
        switch (method) {
            case "--firstFirst":
                return coverDecoration(person.getFirstNameFirst());
            case "--lastFirst":
                return coverDecoration(person.getSecondNameFirst());
            default:
                throw new RuntimeException("Method not found");
        }
    }

    private List<String> coverDecoration(String personName) {
        int labelSize = getLabelSizeAccordingToFirstName();
        if (personName.equals(person.getSecondNameFirst())) {
            labelSize = getLabelSizeAccordingToLastName();
        }
        List<String> design = new ArrayList<>();
        design.add("+-" + symbol("-", labelSize) + "-+");
        design.add("| " + personName + symbol(" ", labelSize - personName.length()) + " |");
        design.add("|-" + symbol("-", labelSize) + "-|");
        design.add("| " + person.getAddress() + symbol(" ", labelSize - person.getAddress().length()) + " |");
        design.add("| " + person.getCountry() + symbol(" ", labelSize - person.getCountry().length()) + " |");
        design.add("+-" + symbol("-", labelSize) + "-+");
        return design;
    }

    private String symbol(String type, int width) {
        String result = "";
        for (int index = 0; index < width; index++)
            result += type;
        return result;
    }

    private boolean isNameGreaterThanAddress() {
        if (method.equals("--firstFirst"))
            return person.isFirstNameFirstGreaterThanAddress();
        return person.isLastNameFirstGreaterThanAddress();
    }

    private int getLabelSizeAccordingToLastName() {
        if (isNameGreaterThanAddress() && method.equals("--lastFirst"))
            return person.getSecondNameFirst().length();
        return person.getLengthOfAddress();
    }

    private int getLabelSizeAccordingToFirstName() {
        if (isNameGreaterThanAddress() && method.equals("--firstFirst"))
            return person.getFirstNameFirst().length();
        return person.getLengthOfAddress();
    }

}
