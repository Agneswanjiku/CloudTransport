package firebase;

public class model {
    private int seatId;
    private String name;

    public model(int seatId) {
        this.seatId = seatId;

    }

    public model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSeatId() {
        return seatId;
    }
}

