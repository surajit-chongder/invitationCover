public enum Gender {
    Male("Mr"),
    Female("Ms");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
