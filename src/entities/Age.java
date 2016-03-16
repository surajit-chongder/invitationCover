package entities;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public boolean isOlder(int age) {
        return this.age >= age;
    }
}
