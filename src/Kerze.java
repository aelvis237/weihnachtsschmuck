public class Kerze extends Weihnachtsschmuck {
    private int hoehe;
    public Kerze(String farbe, float radius, int hoehe) {
        super(farbe, radius);
        this.hoehe = hoehe;
    }
    public float getVolumen() {
        return (float) Math.PI * (float) Math.pow(getRadius(), 2) * hoehe;
    }
    public String toString() {
        return super.toString() + ", Hoehe: " + hoehe;
    }
}
