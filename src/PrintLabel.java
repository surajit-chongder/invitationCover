import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class PrintLabel {

    private static String getNext(String[] args, String method) throws RuntimeException {
        for (int index = 0; index < args.length; index++) {
            if (Objects.equals(args[index], method))
                return args[index + 1];
        }
        throw new RuntimeException("Method not available");
    }

    public static void main(String[] args) throws IOException {
        List<String> guests = new Reader(getNext(args, "--file")).read();
        PersonGenerator persons = new PersonGenerator(guests);
        List<Person> allGuest = persons.generatePerson();

        OptionHandler handler = new OptionHandler(args, allGuest);
        List<Person> printList = handler.guestList();


        for (Person guest : printList) {
            CoverDecorator coverDecorator = new CoverDecorator(guest, args[0]);
            List eachDesign = coverDecorator.decoration();
            for (Object each : eachDesign) {
                System.out.println(each);
            }
        }
    }
}
