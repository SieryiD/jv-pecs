package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Machine() {
    }
}
