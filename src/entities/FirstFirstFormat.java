package entities;

public class FirstFirstFormat implements Formator {
    @Override
    public String createFormat(Gender gender, String firstName, String secondName) {
        return String.format("%s %s %s",gender,firstName,secondName);
    }
}
