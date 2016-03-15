package entities;

public class State {
    private final String state;

    public State(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.valueOf(state);
    }
}
