public class PersonDetails {
    Person person;
    String age;
    PersonAddress address;

    public PersonDetails(String firstName, String surName, String gender,String age,String city,String state,String country) {
        this.person = new Person(firstName,surName,gender);
        this.age = age;
        this.address = new PersonAddress(city,state,country);
    }

//    @Override
//    public String toString() {
//        return ;
//    }
}
