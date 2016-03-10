import java.util.List;
import java.util.Objects;

public class OptionHandler {
    private final String[] args;
    private final List<Person> guests;

    public OptionHandler(String[] args, List<Person> allGuest) {
        this.args = args;
        this.guests = allGuest;
    }

    public List<String> guestList() {
        List<String> printList;

        switch (args.length) {
            case 3:
                PersonLabel label = new PersonLabel(args[0], guests);
                printList = label.representation();
                break;
            case 5:
                List<Person> guestsFromParticularCountry = new Filter(guests).filteringByCountry(getNext(args, "--country"));
                CountryLabel countryLabel = new CountryLabel(args[0], guestsFromParticularCountry);
                printList = countryLabel.representation();
                break;
            case 7:
                List<Person> guestsCountry = new Filter(guests).filteringByCountry(getNext(args, "--country"));
                int age = Integer.parseInt(getNext(args, "--age"));
                List<Person> guestsAboveAgeCountry = new Filter(guestsCountry).filteringByAboveAge(age);
                CountryAgeLabel countryAgeLabel = new CountryAgeLabel(args[0], guestsAboveAgeCountry);
                printList = countryAgeLabel.representation();
                break;
            default:
                throw new RuntimeException("Method not available");
        }
        return printList;
    }

    private String getNext(String[] args, String method) throws RuntimeException {
        for (int index = 0; index < args.length; index++) {
            if (Objects.equals(args[index], method))
                return args[index + 1];
        }
        throw new RuntimeException("Parameter Missing");
    }
}
