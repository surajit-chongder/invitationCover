import java.io.IOException;
import java.util.List;

public class PrintGuestLabel {
    public static void main(String[] args) throws IOException {
        List printList;

        switch (args.length){
            case 2:
                PersonWiseLabel label = new PersonWiseLabel(args[0], args[1]);
                printList = label.allGuests();
                break;
            case 3:
                CountryWiseLabel CountryLabel = new CountryWiseLabel(args[0], args[1],args[2]);
                printList = CountryLabel.allGuests();
                break;
            case 5:
                CountryAgeWiseLabel countryAgeLabel = new CountryAgeWiseLabel(args[0], args[1], args[2], args[3], args[4]);
                printList = countryAgeLabel.allGuests();
                break;
            default:
                throw new RuntimeException("Method not available");
        }

        for (Object aPrintList : printList) {
            System.out.println(aPrintList);
        }
    }
}
