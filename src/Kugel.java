public class Kugel extends Weihnachtsschmuck{
    private String material;
    public Kugel(String farbe, float radius, String material) {
        super(farbe, radius);
        this.material = material;
    }
    public float getVolumen() {
        return (4.0f / 3.0f) * (float) Math.PI * (float) Math.pow(getRadius(), 3);
    }
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
