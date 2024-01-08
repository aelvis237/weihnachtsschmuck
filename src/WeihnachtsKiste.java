public class WeihnachtsKiste{
        private Weihnachtsschmuck[] schmuckArray;
    public WeihnachtsKiste(Weihnachtsschmuck[] schmuckArray) {
            this.schmuckArray = schmuckArray;
        }
        public void zeigen() {
            float gesamtVolumen = 0.0f;
            for (Weihnachtsschmuck schmuck : schmuckArray) {
                System.out.println(schmuck.toString());
                gesamtVolumen += schmuck.getVolumen();
            }
            System.out.println("Gesamtes Volumen: " + gesamtVolumen);
        }
        public static void main(String[] args) {
            Kugel kugel1 = new Kugel("Rot", 2.0f, "Glas");
            Stern stern1 = new Stern("Gold", 2.0f, true);
            Kerze kerze1 = new Kerze("Weiß", 1.5f, 10);
            Kugel kugel2 = new Kugel("Blau", 2.5f, "Kunststoff");
            Stern stern2 = new Stern("Silber", 1.8f, false);
            Kerze kerze2 = new Kerze("Rot", 2.0f, 8);
            Weihnachtsschmuck[] schmuckArray = {kugel1, stern1, kerze1, kugel2, stern2, kerze2};
            WeihnachtsKiste kiste = new WeihnachtsKiste(schmuckArray);
            kiste.zeigen();
        }
    }
