package notes.db.jdbc;

import java.time.Duration;

public class Model {
    private int id;
    private Duration interval;

    public Model(int id, Duration interval) {
        this.id = id;
        this.interval = interval;
    }

    public int getId() {
        return id;
    }

    public Duration getInterval() {
        return interval;
    }
}
