package entities;

public class LastFirstFormat implements Formator {
    @Override
    public String createFormat(Gender gender, String firstName, String secondName) {
        return String.format("%s %s, %s",gender,secondName,firstName);
    }
}
