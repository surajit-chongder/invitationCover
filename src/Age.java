public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

    public boolean isOlder(int age) {
        return this.age >= age;
    }
}
