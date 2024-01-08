public abstract class Weihnachtsschmuck {
    private String farbe;
    private float radius;
    public Weihnachtsschmuck(String farbe, float radius) {
        this.farbe = farbe;
        this.radius = radius;
    }
    public abstract float getVolumen();
    public String toString() {
        return "Farbe: " + farbe + ", Radius: " + radius;
    }
    public float getRadius() {
        return radius;
    }
}
