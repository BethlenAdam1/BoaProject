public class BoaFile {
    private String race;
    private double length;
    private boolean isPoisonous;

    public BoaFile(String race, double length, boolean isPoisonous) {
        this.race = race;
        this.length = length;
        this.isPoisonous = isPoisonous;
    }

    public String getRace() {
        return race;
    }

    public double getLength() {
        return length;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }
}
