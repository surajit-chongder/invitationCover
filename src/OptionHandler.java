import java.util.List;
import java.util.Objects;

public class OptionHandler {
    private final String[] args;
    private final List<Person> guests;

    public OptionHandler(String[] args, List<Person> allGuest) {
        this.args = args;
        this.guests = allGuest;
    }

    public List<Person> guestList() {
        List<Person> printList;

        switch (args.length) {
            case 3:
                printList = guests;
                break;
            case 5:
                printList =  new Filter(guests).filteringByCountry(getNext(args, "--country"));
                break;
            case 7:
                List<Person> guestsCountry = new Filter(guests).filteringByCountry(getNext(args, "--country"));
                int age = Integer.parseInt(getNext(args, "--ageAbove"));
                printList = new Filter(guestsCountry).filteringByAboveAge(age);
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
