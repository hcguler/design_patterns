package behavioral.strategy.example_1;

import java.io.Serializable;

public class Bean implements Serializable {
    private String name;
    private int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
