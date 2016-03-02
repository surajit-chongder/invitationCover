public class Guest extends Person {

    public Guest(String firstName, String surName, String gender) {
        super(firstName, surName, gender);
    }

    public String labelRepresentAccordingToSecondName() {
        return super.genderRepresentation() + " " + super.getSecondName() + "," + super.getFirstName();

    }

    public String simpleLabelRepresent() {
        return super.genderRepresentation() + " " + super.getFirstName() + " " + super.getSecondName();
    }
}
