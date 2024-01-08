public class Stern extends Weihnachtsschmuck{
    private boolean glitzert;
    public Stern(String farbe, float radius, boolean glitzert) {
        super(farbe, radius);
        this.glitzert = glitzert;
    }
    public float getVolumen() {
        return (float) Math.PI * (float) Math.pow(getRadius(), 2);
    }
    public String toString() {
        return super.toString() + ", Glitzert: " + glitzert;
    }
}
