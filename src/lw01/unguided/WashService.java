package lw01.unguided;

public abstract class WashService implements Billable {
    private String id;
    private int days;

    protected WashService(String id, int days) {
        if (days <= 0 && days > 30) {
            throw new IllegalArgumentException("Days must be between 1 and 30");
        }
        this.id = id;
        this.days = days;
    }
    public String getId() {
        return id;
        }
    public int getDays() {
        return days;
    }
    @Override 
    public abstract int calculateCharge();

    public int calculateCharge(int units) {
        if (units <= 0 && units > 10) {
            throw new IllegalArgumentException("Units must be between 1 and 10");
        }
        return calculateCharge() * units;
    }
    public String label() {
        return "Service";
    }
    public String summary() {
        return id + " | " + label() + " | " + calculateCharge();
    }
}